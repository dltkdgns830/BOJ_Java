package Bronze_3;

import java.util.Scanner;

public class BOJ_10950 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        
        int[][] array = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            array[i][0] = stdIn.nextInt();
            array[i][1] = stdIn.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println(array[i][0] + array[i][1]);
        }
        
    }
}
