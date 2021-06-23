package Silver_2;

import java.io.*;
import java.util.*;

public class BOJ_1912 {

	 public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		 BufferedReader br = new BufferedReader(reader);
		 StringTokenizer st;
		 
		 int n = Integer.parseInt(br.readLine());
		 int[] a = new int[n];
		 int[] d = new int[n];
		 
		 st = new StringTokenizer(br.readLine(), " ");
		 
		 for (int i = 0; i < n; i++) {
			 a[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 d[0] = a[0];
		 
		 for (int i = 1; i < n; i++) {
			 if ((d[i - 1] + a[i]) > a[i]) d[i] = d[i - 1] + a[i];
			 else d[i] = a[i];
		 }
		
		 int max = Integer.MIN_VALUE;
		 for (int i = 0; i < n; i++) {
			 if (max < d[i]) max = d[i];
		 }
		 
		 System.out.print(max);
    }
}
	

