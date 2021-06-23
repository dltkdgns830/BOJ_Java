package Silver_5;

import java.util.Scanner;

public class BOJ_2581 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int M = stdIn.nextInt();
        int N = stdIn.nextInt();
        
        boolean result[];
        result = PrimeNumBetween(N);
        int sum = 0;
        int min = 0;
        boolean flag = true;
        
        for (int i = M; i <= N; i++) {
            if (result[i] == false) sum += i;
        }
        
        for (int i = M; i <= N; i++) {
            if (result[i] == false) {
                min = i;
                break;
            }
        }
        
        if (sum == 0) System.out.print(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
        
    }
    
    public static boolean[] PrimeNumBetween(int N) {
        
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
