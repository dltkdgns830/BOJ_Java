package Silver_1;

import java.io.*;
import java.util.*;

public class BOJ_10844 {
	 public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		long mod = 1000000000L;
		int input = Integer.parseInt(br.readLine());
        long[][] d = new long[input+1][10];
		
		
		 for (int i = 1; i < 10; i++) {
			 d[1][i] = 1L;
		 }
		 
         for (int i = 2; i <= input; i++) {
            for (int j = 1; j <= 8; j++) {
				d[i][j] = (d[i-1][j+1] + d[i-1][j-1])% mod;
			 }	
			 
			 d[i][0] = d[i-1][1]% mod;
			 d[i][9] = d[i-1][8]% mod;
        } 

            long result = 0;
		 
			
			for (int i = 0; i < 10; i++) {
				result += d[input][i];
			}
			
            System.out.println(result % mod);  
    }
}
	

