package Bronze_4;

import java.util.Scanner;
    
public class BOJ_2420 {
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        long n = stdIn.nextInt();
        long m = stdIn.nextInt();
        
        long result = n-m;
        
        if (result < 0) result *= -1 ;
            
        System.out.print(result);
        
    }
}
