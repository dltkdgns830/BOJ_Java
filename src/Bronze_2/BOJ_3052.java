package Bronze_2;

import java.util.Scanner;

public class BOJ_3052 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int[] array = new int[42];
            
        for(int i = 0; i < 10; i++) {
			int num = stdIn.nextInt();
            
            array[num % 42]++;
		}
        
        int count = 0;
        
        for(int i = 0; i < 42; i++) {
			if (array[i] != 0) count++;
		}
        
        System.out.println(count);
    }
    
}
