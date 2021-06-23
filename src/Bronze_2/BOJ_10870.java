package Bronze_2;

import java.util.Scanner;

public class BOJ_10870 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int input = stdIn.nextInt();
        
        System.out.print(Fibonacci(input));
    
    }
    
    public static int Fibonacci(int n) {
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
