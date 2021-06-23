package Bronze_2;

import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();
        int c = stdIn.nextInt();
        int calc = a * b * c;
        
        int[] array = new int[10];
        
        while (calc > 0) {
            array[calc % 10]++;
            calc /= 10;
        }
        
        for(int result : array) {
			System.out.println(result);
		}
    }
    
}
