package Silver_1;

import java.io.*;
import java.util.*;

public class BOJ_11057 {

	 public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		 BufferedReader br = new BufferedReader(reader);
		 StringTokenizer st;
		 st = new StringTokenizer(br.readLine());
		 
		 int n = Integer.parseInt(st.nextToken());
		 long[][] d = new long[n + 1][10];
		
		 for (int i = 0; i < 10; i++) {
			 d[1][i] = 1;
		 }
		 
		 for (int i = 2; i <= n; i++) {
			 for (int j = 0; j < 10; j++) {
				 d[i][j] = 0;
				 for (int k = 0; k <= j; k++) {
					 d[i][j] += d[i - 1][j - k];
				 }
				 d[i][j] %= 10007;
			 }
		 }
		 
		 long sum = 0;
		 
		 for (int i = 0; i < 10; i++) {
			 sum += d[n][i];
			
		 }
		 sum %= 10007;
		 
		 System.out.print(sum);
    }
}
