package Bronze_3;

import java.util.Scanner;

public class BOJ_10250 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        
        for (int i = 0; i < TestCase; i++) {
        int H = stdIn.nextInt();
        int W = stdIn.nextInt();
        int N = stdIn.nextInt();
        int room = N;
        int count = 0;
        
        while (N > 0) {
            N -= H;
            count++;
        }
        
        room -= H * (count - 1);
        
        System.out.printf("%d%02d",room,count);
        System.out.println();
        }
    }
}