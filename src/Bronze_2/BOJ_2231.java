package Bronze_2;

import java.io.*;
import java.util.*;

 
public class BOJ_2231 {
	public static void main(String[] args) throws IOException {
    
		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
    
		String str_N = br.readLine();
		int N_len = str_N.length();
		int N = Integer.parseInt(str_N);
		int result = 0;
 
		for(int i = (N - (N_len * 9)); i < N; i++) {
			int number = i;
			int sum = 0;	
			
			while(number != 0) {
				sum += number % 10;	
				number /= 10;
			}
			
			
			if(sum + i == N) {
				result = i;
				break;
			}
			
		}
 
		System.out.println(result);
	}
 
}