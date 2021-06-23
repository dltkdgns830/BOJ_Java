package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_2193 {
	 public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		int input = Integer.parseInt(br.readLine());
        long[][] d = new long[input+1][2];
		
		d[1][0] = 0;
		d[1][1] = 1;
		 
		 for (int i = 2; i <= input; i++) {
			 d[i][0] = d[i-1][0] + d[i-1][1];
			 d[i][1] = d[i-1][0];
		 }
		 
		 long result = d[input][0] + d[input][1];
		 System.out.print(result);
    }
}