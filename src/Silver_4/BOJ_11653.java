package Silver_4;

import java.util.Scanner;
 
public class BOJ_11653 {
    
	public static void main(String[] args) {
        
		Scanner stdIn = new Scanner(System.in);
        
		int N = stdIn.nextInt();
 
		for (int i = 2; i <= Math.sqrt(N); i++) {
            
			while (N % i == 0) {
                
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}
        
	}
    
}