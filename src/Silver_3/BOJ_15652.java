package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_15652 {
	static int[] a = new int[10];
	static int[] count = new int[10];
	static boolean[] check = new boolean[10];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		func(0, 1, n, m);
		
		System.out.print(sb);
	}
	
	public static StringBuilder func(int index, int selected, int n, int m) {
		if (selected == m) {
            StringBuilder sb = new StringBuilder();
            for (int i=1; i<=n; i++) {
                for (int j=1; j<=count[i]; j++) {
                    sb.append(i);
                    sb.append(" ");
                }
            }
            sb.append("\n");
            return sb;
        }
		
		StringBuilder ans = new StringBuilder();
        if (index > n) return ans;
        for (int i = m-selected; i >= 1; i--) {
            count[index] = i;
            ans.append(func(index+1, selected+i, n, m));
        }
        count[index] = 0;
        ans.append(func(index+1, selected, n, m));
        return ans;
	}
}
