package Silver_1;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_17087 {
    
    public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(st.nextToken());
		int S = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] array = new int[N];
		
		for (int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
     	for (int i = 0; i < N; i++) {
			array[i] = S - array[i];
			if (array[i] < 0) array[i] *= -1;
		}
		int gcd = array[0];
		
		for (int i = 1; i < N; i++) {
			gcd = GCD(gcd,array[i]);
		}
		
		System.out.print(gcd);
    }
    
    public static int GCD(int a, int b) {
        
        if (b == 0) return a;
        return GCD(b, a % b);
    }
}
