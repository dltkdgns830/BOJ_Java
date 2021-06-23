package Silver_2;

import java.util.Scanner;

public class BOJ_4948 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        while (true) {
            
            int N = stdIn.nextInt();
            if (N == 0) break;
            boolean result[];
            result = PrimeNum(2 * N);
            int count = 0;
        
            for (int i = N + 1; i <= 2 * N; i++) {
                if (result[i] == false) count++;
            }
            
            System.out.println(count);
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


