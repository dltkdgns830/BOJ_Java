package Bronze_3;

import java.util.Scanner;

public class BOJ_10818 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = stdIn.nextInt();
        }
        
        int max = array[0];
        int min = array[0];
        
        for (int i = 0; i < n; i++) {
            if (max < array[i]) max = array[i];
            if (min > array[i]) min = array[i];
        }
        
        System.out.printf("%d %d",min,max);
    }
    
}
