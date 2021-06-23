package Bronze_1;

import java.util.Scanner;

public class BOJ_2869 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int A = stdIn.nextInt();
        int B = stdIn.nextInt();
        int V = stdIn.nextInt();
        int count = (V - B) / (A - B); 
        
        if ((V - B) % (A - B) != 0) count++;
        
        System.out.print(count);
    }
}
