package Gold_5;

import java.io.*;
import java.util.*;

public class BOJ_2225 {

	 public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		 BufferedReader br = new BufferedReader(reader);
		 StringTokenizer st;
		 st = new StringTokenizer(br.readLine());
		 long mod = 1000000000L;
		 
		 int n = Integer.parseInt(st.nextToken());
		 int k = Integer.parseInt(st.nextToken());
		 long[][] d = new long[k + 1][n + 1];
		
		 d[0][0] = 1;
		 
         for (int i=1; i<=k; i++) {
            for (int j=0; j<=n; j++) {
                for (int l=0; l<=j; l++) {
                    d[i][j] += d[i-1][j-l];
                    d[i][j] %= mod;
                }
            }
        }
		 
		 System.out.print(d[k][n]);
		 
    }
}
	