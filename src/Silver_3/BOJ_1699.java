package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_1699 {

	 public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		 BufferedReader br = new BufferedReader(reader);
		 StringTokenizer st;
		 
		 int n = Integer.parseInt(br.readLine());
		 int[] d = new int[n + 1];		 

		 d[0] = 0;
		 d[1] = 1;
		 
		 for (int i = 2; i <= n; i++) {
			 
			d[i] = i;
			 
			 for (int j = 1; j*j <= i; j++) {
				 if (d[i] > d[i - j * j] + 1) {
					 d[i] = d[i - j * j] + 1;
				 }
			 }
		 }
		 
		 System.out.print(d[n]);
		 
    }
}
	


