package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_15990 {
	 public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		long mod = 1000000009L;
		int T = Integer.parseInt(br.readLine());
        long[][] d = new long[100001][4];
		 
         for (int i=1; i <= 100000; i++) {
            	if (i-1 >= 0) {
                	d[i][1] =( d[i-1][2] + d[i-1][3]) % mod;
                	if (i == 1) {
						d[i][1] = 1;
                	}
            	}
            	if (i-2 >= 0) {
                	d[i][2] = (d[i-2][1] + d[i-2][3]) % mod;
                	if (i == 2) {
                	    d[i][2] = 1;
                	}
          		}
				if (i-3 >= 0) {
					d[i][3] = (d[i-3][1] + d[i-3][2]) % mod;
					if (i == 3) {
						d[i][3] = 1;
					}
                }
            }
         
        while(T-- > 0) {
            
            int input = Integer.parseInt(br.readLine());
            long result = 0;
			
			for (int i = 1; i < 4; i++) {
				result += d[input][i];
			}
			
            System.out.println(result % mod);  
        }	
        
    }
}
	
