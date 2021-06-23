package Bronze_2;

import java.util.Scanner;

public class BOJ_2562 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        int[] array = new int[9];
        
        for (int i=0; i<9; i++) {
            array[i] = stdIn.nextInt();
        }
        
        int max = array[0];
        int count = 0;
        
        for (int i=1; i<9; i++) {
            if (max < array[i]) {
                max = array[i];
                count = i;
            }
        }
        
        System.out.println(max);
        System.out.println(count+1);
        
    }
}