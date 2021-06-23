package Bronze_3;

import java.util.Scanner;

public class BOJ_1085 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        int w = stdIn.nextInt();
        int h = stdIn.nextInt();
        
        int[] array = new int[4];
        
        array[0] = x;
        array[1] = w - x;
        array[2] = h - y;
        array[3] = y;
        int min = 1001;
        
        for (int i = 0; i < 4; i++) {
            if (min > array[i]) min = array[i];
        }
        
        System.out.print(min);
    }
}
