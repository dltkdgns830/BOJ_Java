package Silver_3;

import java.io.*;
import java.util.*;

 
public class BOJ_1003 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[] a = new int[41];
		int[] b = new int[41];
		int[] d = new int[41];
		
		a[0] = 1;
		a[1] = 0;
		b[0] = 0;
		b[1] = 1;
		
		d[1] = 1;
		d[2] = 1;
		
		for (int i = 3; i < 41; i++) {
			d[i] = d[i-1] + d[i-2];
		}
		
		for (int i = 2; i < 41; i++) {
			a[i] = d[i-1];
			b[i] = d[i];
		}
		
		while(n-- > 0) {
			int x = Integer.parseInt(br.readLine());
			
			sb.append(a[x] + " " + b[x] + "\n");		
		}
		System.out.print(sb);
	}
}
