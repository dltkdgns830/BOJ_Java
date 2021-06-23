package Silver_5;

import java.io.*;
import java.util.*;

public class BOJ_7568 {
	public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st; 
		
		
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[n];
		int[] y = new int[n];
		int[] big = new int[n];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			x[i] = Integer.parseInt(st.nextToken());
			y[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i) continue;
				
				if (x[i] < x[j] && y[i] < y[j]) big[i]++;
			}
		}
		
		for (int i : big) {
			System.out.print(i+1 + " ");
		}
    }

}
