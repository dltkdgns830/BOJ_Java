package Bronze_1;

import java.io.*;
import java.util.*;

public class BOJ_11050 {
	public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		 BufferedReader br = new BufferedReader(reader);
		
		 StringTokenizer st; 
		 st = new StringTokenizer(br.readLine(), " ");
		 
		 long n = Long.parseLong(st.nextToken());
		 long m = Long.parseLong(st.nextToken());
		
		 System.out.print(combination(n,m));
    }
	
	public static long combination(long n, long m) {
		if (m > n / 2) {
			m = n - m;
		}
		
		long result = 1;
		long divide = 1;
		long temp = m;
		
		for (int i = 0; i < m; i++) {
			divide *= temp;
			temp--;
		}
		for (int i = 0; i < m; i++) {
			result *= n;
			n--;
		}
		
		result /= divide;
		
		return result;
	}

}