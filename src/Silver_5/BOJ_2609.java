package Silver_5;

import java.util.Scanner;

public class BOJ_2609 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        
        System.out.println(GCD(a,b));
        System.out.println(LCM(a,b));
        
    }
    
    public static int GCD(int A, int B) {
        
        if (B == 0) return A;
        else return GCD(B, A % B);
    }
    
    public static int LCM(int A, int B) {
        return A * B / GCD(A, B);
    }
}
