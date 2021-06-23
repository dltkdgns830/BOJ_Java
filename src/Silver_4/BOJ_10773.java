package Silver_4;

import java.io.*;
import java.util.*;

 
public class BOJ_10773 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		Stack<Integer> s = new Stack<Integer>();
		
		int T = Integer.parseInt(br.readLine());
		
		while (T-- > 0) {
			int n = Integer.parseInt(br.readLine());
			if (n == 0) {
				s.pop();
			} else {
				s.push(n);
			}
		}
		int result = 0;
		while(!s.empty()) {
			result += s.peek();
			s.pop();
		}
		
		System.out.print(result);
	}
}