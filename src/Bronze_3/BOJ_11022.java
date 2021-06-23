package Bronze_3;

import java.util.Scanner;

public class BOJ_11022 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);

        int n = stdIn.nextInt();
        
        int[][] array = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            array[i][0] = stdIn.nextInt();
            array[i][1] = stdIn.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            int result = array[i-1][0] + array[i-1][1];
            System.out.println("Case #" + i + ": " + array[i-1][0] + " + " + array[i-1][1] + " = " + result);
        }
        
    }
}
