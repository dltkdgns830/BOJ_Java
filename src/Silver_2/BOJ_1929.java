package Silver_2;

import java.util.Scanner;

public class BOJ_1929 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int M = stdIn.nextInt();
        int N = stdIn.nextInt();
        
        boolean result[];
        result = PrimeNum(N);
        
        for (int i = M; i <= N; i++) {
            if (result[i] == false) System.out.println(i);
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

