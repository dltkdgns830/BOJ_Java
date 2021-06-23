package Silver_2;

import java.io.*;
import java.util.*;

public class BOJ_11053 {
	 public static void main(String[] args) throws IOException {
        
   		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 StringTokenizer st;
		 int n = Integer.parseInt(br.readLine());
		 int[] a = new int[n];
		 int[] d = new int[n];
		 
		 st = new StringTokenizer(br.readLine());
		 for (int i = 0; i < n; i++) {
			 a[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 for (int i = 0; i < n; i++) {
			 d[i] = 1;
			 for (int j = 0; j < i; j++) {
				 if (a[i] > a[j] && d[i] < d[j]+1) {
					 d[i] = d[j] + 1;
				 }
			 }
		 }
		 
		 int max = d[0];
		 
		 for (int i = 0; i < n; i++) {
			 if (max <d[i]) max = d[i];
		 }
		 
		 System.out.print(max);
    }
}
	
