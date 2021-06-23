package Silver_4;

import java.io.*;
import java.util.*;

public class BOJ_2485 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] diff = new int[n-1];
		
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(a);
		
		for (int i = 0; i < n - 1; i++) {
			diff[i] = a[i+1] - a[i];
		}
		
		int min = GCD(diff[0], diff[1]);
		
		for (int i = 2; i < n - 1; i++) {
			
			int temp = GCD(min,diff[i]);
			if (temp < min) min = temp;
		}
		
		int count = 0;
		
		for (int i = 0; i < n - 1; i++) {
			count += (diff[i] / min) - 1;
		}
		
		System.out.print(count);
	}
	
	public static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a % b);
	}
}
