package Bronze_4;

import java.util.Scanner;

public class BOJ_1712 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        
        if (c<=b) System.out.println("-1");
        
        else System.out.println(a/(c-b)+1);
        
    }
}
