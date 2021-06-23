package Silver_1;

import java.io.*;
import java.util.*;

public class BOJ_11052 {
	 public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int N = Integer.parseInt(br.readLine());
        int[] d = new int[N+1];
        int[] p = new int[N+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 1; i <= N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
		d[1] = p[1];
        for (int i = 2; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
				d[i] = Math.max(d[i], d[i-j] + p[j]);
			}
        }
        System.out.println(d[N]);
    }
}
