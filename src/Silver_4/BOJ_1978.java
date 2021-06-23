package Silver_4;

import java.util.Scanner;

public class BOJ_1978 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        int count = 0;
        
        for (int i = 0; i < TestCase; i++) {
            int input = stdIn.nextInt();
            
            if (PrimeNum(input) == true) count++;
        }
        
        System.out.print(count);
        
    }
    
    public static boolean PrimeNum(int input) {
        
        boolean[] prime = new boolean[input + 1];
        prime[0] = true;
        prime[1] = true;
        
        for (int i = 2; i * i <= input; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= input; j += i) {
                    prime[j] = true;
                }
            }
        }
        
        if (prime[input] == false) return true;
        else return false;
    }
}
