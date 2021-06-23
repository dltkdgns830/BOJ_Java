package Bronze_2;

import java.util.Scanner;

public class BOJ_2675 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        
        for (int i = 0; i < TestCase; i++) {
            
            int Repeat = stdIn.nextInt();
            String input = stdIn.next();
            
            for (int j = 0; j < input.length(); j++) {
                for (int k = 0; k < Repeat; k++) {
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
        
    }
}
