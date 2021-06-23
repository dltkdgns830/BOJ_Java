package Bronze_3;

import java.util.Scanner;

public class BOJ_10871 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        int x = stdIn.nextInt();

        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = stdIn.nextInt();    
        }
        
        for (int i = 0; i < n; i++) {
            if (array[i] < x ) System.out.print(array[i] + " ");
        }
        
    }
}
