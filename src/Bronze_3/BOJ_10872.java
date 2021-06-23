package Bronze_3;

import java.util.Scanner;

public class BOJ_10872 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int input = stdIn.nextInt();
        
        System.out.print(Factorial(input));
    
    }
    
    public static int Factorial(int n) {
        if (n == 1 || n == 0) return 1;
        else return Factorial(n - 1) * n;
    }
}