package Gold_5;

import java.io.*;
import java.util.*;

public class BOJ_1107 {
	static boolean[] broken;
			
	static int check(int n) {
        if (n == 0) {
            if (broken[0]) {
                return 0;
            } else {
                return 1;
            }
        }
        int len = 0;
        while (n > 0) {
            if (broken[n % 10]) {   
                return 0;
            }
            n /= 10;
            len += 1;  
        }
        return len;
	}

	public static void main(String[] args) throws IOException {
		
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int s = Integer.parseInt(br.readLine());
		broken = new boolean[10];
		
		if (s != 0) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int i = 0; i < s; i++) {
				broken[Integer.parseInt(st.nextToken())] = true;
			}
		}
		
		int ans = Math.abs(n - 100);
		
		for (int i = 0; i <= 1000000; i++) {
			int len = check(i);
			
			if (len > 0) {
				int press = Math.abs(i - n);
				
				if (ans > len + press) {
                    ans = len + press;
                }
			}
		}
		
		br.close();
		System.out.println(ans);
	}

}

