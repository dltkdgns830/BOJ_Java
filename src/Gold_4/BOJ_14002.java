package Gold_4;

import java.io.*;
import java.util.*;

public class BOJ_14002 {
		 static int[] a;
		 static int[] d;
		 static int[] v;
	 public static void main(String[] args) throws IOException {
        
   		 FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		 StringTokenizer st;
		 int n = Integer.parseInt(br.readLine());
		 a = new int[n];
		 d = new int[n];
		 v = new int[n];
		 
		 st = new StringTokenizer(br.readLine());
		 for (int i = 0; i < n; i++) {
			 a[i] = Integer.parseInt(st.nextToken());
		 }
		 
		 for (int i = 0; i < n; i++) {
			 d[i] = 1;
			 v[i] = -1;
			 for (int j = 0; j < i; j++) {
				 if (a[i] > a[j] && d[i] < d[j]+1) {
					 d[i] = d[j] + 1;
					 v[i] = j;
				 }
			 }
		 }
		 
		 int max = d[0];
		 int p = 0;
		 
		 for (int i = 0; i < n; i++) {
			 if (max <d[i]) {
				 max = d[i];
				 p = i;
			 }
		 }
		
		 System.out.println(max);
		go(p);
    }
	    static void go(int p) {
        if (p == -1) return;
        go(v[p]);
        System.out.print(a[p] + " ");
    }
}
	

