package Bronze_2;

import java.io.*;
import java.util.*;
 
public class BOJ_2798 {
	public static void main(String[] args) throws IOException {
    
		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st; 
		
    	st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[n];
		
		for (int i = 0; i < n; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		int max = 0;
		
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					int sum = array[i] + array[j] + array[k];
					if (sum > max && sum <= m) max = sum;
				}
			}
		}
		
		System.out.println(max);
		
		
	}
 
}
