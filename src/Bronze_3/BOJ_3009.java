package Bronze_3;

import java.util.Scanner;

public class BOJ_3009 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int[] X = new int[3];
        int[] Y = new int[3];
        
        int X_Max = 0;
        int Y_Max = 0;
        int X_Min = 1001;
        int Y_Min = 1001;

        for (int i = 0; i < 3; i++) {
            X[i] = stdIn.nextInt();
            Y[i] = stdIn.nextInt();
        }
        
        for (int i = 0; i < 3; i++) {
            if (X_Max < X[i]) X_Max = X[i];
            if (X_Min > X[i]) X_Min = X[i];
        }
        
        for (int i = 0; i < 3; i++) {
            if (Y_Max < Y[i]) Y_Max = Y[i];
            if (Y_Min > Y[i]) Y_Min = Y[i];
        }
        
        int X_Sum = 0;
        int Y_Sum = 0;
        
        for (int i = 0; i < 3; i++) {
            X_Sum += X[i];
        }
        
        for (int i = 0; i < 3; i++) {
            Y_Sum += Y[i];
        }
        
        int X_result = (X_Max + X_Min) * 2 - X_Sum;
        int Y_result = (Y_Max + Y_Min) * 2 - Y_Sum;
        System.out.print(X_result + " " + Y_result);
        
    }
}
