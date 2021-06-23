package Silver_1;

import java.util.Scanner;

public class BOJ_9020 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
 
        int TestCase = stdIn.nextInt();
        
        for (int i = 0; i < TestCase; i++) {
            
            int N = stdIn.nextInt();
            boolean array[]; 
            array = PrimeNum(N);
            int x = N / 2;
            int y = N / 2;
            
            while (true) {
                if (array[x] == false && array[y] == false) break;
                else {
                    x--;
                    y++;
                }
            }
            
            System.out.println(x + " " + y);
        }
            
    }
    
    public static boolean[] PrimeNum(int N) {
        
        boolean[] prime = new boolean[N + 1];
        prime[0] = true;
        prime[1] = true;
        
        for (int i = 2; i * i <= N; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    prime[j] = true;
                }
            }
        }
    
        return prime;
    }
}
