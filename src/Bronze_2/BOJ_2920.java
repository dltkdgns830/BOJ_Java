package Bronze_2;

import java.util.Scanner;

public class BOJ_2920 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        int[] array = new int[8];
        String a = "";
        
        for (int i = 0; i < 8; i++) {
            array[i] = stdIn.nextInt();
        }
        
        for (int i = 0; i < 7; i++) {
            if (array[i+1] - array[i] == 1)    a = "ascending";
            else if (array[i+1] - array[i] == -1) a = "descending";
            else {
                a = "mixed";
                break;
            }
        }
        
        System.out.print(a);
        
    }
}
