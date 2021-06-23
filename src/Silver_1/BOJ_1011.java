package Silver_1;

import java.util.Scanner;

public class BOJ_1011 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        
        for (int i = 0; i < TestCase; i++) {
            
            int X = stdIn.nextInt();
            int Y = stdIn.nextInt();
            
            int distance = Y - X;
            int max = (int)Math.sqrt(distance);
            int count = 0;
            
            if (max * max == distance) count = 2 * max - 1;
            else if (distance <= max * max + max) count = 2 * max;
            else count = 2 * max + 1;
            
            System.out.println(count);
            
        }
    }
}
