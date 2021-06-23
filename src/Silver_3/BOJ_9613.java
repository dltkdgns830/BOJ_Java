package Silver_3;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_9613 {
    
    	public static void main(String[] args) throws IOException {
        
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
        
		for (int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
            
            int N = Integer.parseInt(st.nextToken());
            int[] array = new int[N];
            int j = 0;
            long add = 0;
            
            while(st.hasMoreTokens()) {
                array[j] = Integer.parseInt(st.nextToken());
                j++;
            }
            
            for (int k = 0; k < N - 1; k++) {
                for (int l = k + 1; l < N; l++) {
                    add += GCD(array[k], array[l]);
                }
            }
			sb.append(add +"\n");
		}
		System.out.println(sb);
		
	}
    
    public static int GCD(int a, int b) {
        
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
