package Silver_3;

import java.io.*;
import java.util.*;

 
public class BOJ_11399 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(a);
		
		int[] d = new int[n];
		d[0] = a[0];
		
		for (int i = 1; i < n; i++) {
			d[i] = d[i - 1] + a[i];
		}
		
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += d[i];
		}
		System.out.print(sum);
	}
}