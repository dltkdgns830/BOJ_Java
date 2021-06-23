package Bronze_4;

import java.util.Scanner;

public class BOJ_2588 {
	public static void main(String[] args) {
    
        Scanner stdIn = new Scanner(System.in);
        
        int numA = stdIn.nextInt();
        int numB = stdIn.nextInt();
        
        int a = numB % 10;
        int b = numB % 100 - a;
        int c = numB - a - b;
        
        System.out.println(numA * a);
        System.out.println(numA * b / 10);
        System.out.println(numA * c / 100);
        System.out.println(numA * numB);
		
	}
}