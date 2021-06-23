package Silver_4;

import java.util.Scanner;

public class BOJ_1676 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int input = stdIn.nextInt();
        
        int count = 0;
        int divide = 5;
        while (input >= divide) {
            count += input / divide;
            divide *= 5;
        }
        
        System.out.print(count);
    
    }
}
