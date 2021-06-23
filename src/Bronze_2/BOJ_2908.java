package Bronze_2;

import java.util.Scanner;
 
public class BOJ_2908 {
 
	public static void main(String[] args) {
 
		Scanner stdIn = new Scanner(System.in);
        
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
        
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		
		System.out.print(A > B ? A : B);
	
	}
}
