package Bronze_2;

import java.io.*;
import java.util.*;

public class BOJ_2309 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int[] a = new int[9];
		int sum = 0;

		for (int i = 0; i < 9; i++) {
			a[i] = Integer.parseInt(br.readLine());
			sum += a[i];
		}
		int q = 0;
		int w = 0;
		
		for (int i = 0; i < 8; i++) {
			for (int j = i + 1; j < 9; j++) {
				if (sum - a[i] - a[j] == 100) {
					q = i;
					w = j;
					break;
				}
			}
		}
		
		int[] ans = new int[7];
		int k = 0;
		
		for (int i = 0; i < 9; i++) {
			if (i == q || i == w) continue;
			else {
				ans[k] = a[i];
				k++;
			}
		}
		
		Arrays.sort(ans);
		
		for (int i : ans) {
			System.out.println(i);
		}
		
	}
}
