package Silver_5;

import java.io.*;
import java.util.*;

public class BOJ_1476 {
	public static void main(String[] args) throws IOException {
		
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		StringTokenizer st;
		st = new StringTokenizer(br.readLine(), " ");
		
		int e = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int E = 1;
		int S = 1;
		int M = 1;
		
		for (int i=1; ; i++) {
			
            if (E == e && S == s && M == s) {
                System.out.println(i);
                break;
            }
			
            E += 1;
            S += 1;
            M += 1;
			
            if (E == 16) {
                E = 1;
            }
            if (S == 29) {
                S = 1;
            }
            if (M == 20) {
                M = 1;
            }
        } 
		
	}
}

