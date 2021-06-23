package Bronze_5;

import java.util.Scanner;

public class BOJ_2914 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int songNum = stdIn.nextInt();
        int avg = stdIn.nextInt();
        
        int minimum = songNum * ( avg - 1 ) + 1;

        System.out.print(minimum);
        
    }
}
