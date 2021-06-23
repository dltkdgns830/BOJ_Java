package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_15649 {
	static int[] a = new int[10];
	static boolean[] check = new boolean[10];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		func(0, n, m);
		
		System.out.print(sb);
	}
	
	public static void func(int index, int n, int m) {
		if (index == m) {
			for (int i = 0; i < m; i++) {
				if (i != m - 1) {
					sb.append(a[i] + " ");
				} else {
					sb.append(a[i] + "\n");
				}
			}
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			if (check[i]) continue;
			
			check[i] = true;
			a[index] = i;
			func(index + 1, n, m);
			check[i] = false;
		}
	}
}
