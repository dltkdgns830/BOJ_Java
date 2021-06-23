package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_15656 {
	static int[] a = new int[10];
	static int[] b = new int[10];
	static boolean[] check = new boolean[10];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < n; i++) {
			b[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(b, 0, n);
		
		func(0, n, m);
		
		System.out.print(sb);
	}
	
	public static void func(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				if (i != m - 1) {
					sb.append(b[a[i]] + " ");
				} else {
					sb.append(b[a[i]] + "\n");
				}
			}
			return;
		}
		
		for (int i = 0; i < n; i++) {
			a[index] = i;
			func(index + 1, n, m);
		}
	}
}
