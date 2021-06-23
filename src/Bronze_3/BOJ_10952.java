package Bronze_3;

import java.util.Scanner;

public class BOJ_10952 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        while(true) {
            int x = stdIn.nextInt();
            int y = stdIn.nextInt();
            
            if( x == 0 && y == 0) break;
            System.out.println(x+y);
        }
        
    }
}
