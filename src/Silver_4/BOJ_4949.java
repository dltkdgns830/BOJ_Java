package Silver_4;

import java.io.*;
import java.util.*;

public class BOJ_4949 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			Stack<Character> s = new Stack<Character>();
			
			String input = br.readLine();
			if (input.equals(".")) break;
			String check = "yes";
			
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == '(') {
					s.push('(');
				} else if (input.charAt(i) == '[') {
					s.push('[');
				} else if (input.charAt(i) == ')') {
					if (s.empty() || s.peek() != '(') {
						check = "no";
					} else s.pop();
				} else if (input.charAt(i) == ']') {
					if (s.empty() || s.peek() != '[') {
						check = "no";
					} else s.pop();
				} else continue;
				
				
			}
			
			if (!s.empty()) {
					check = "no";
				}
			
			sb.append(check + "\n");
		}

		System.out.print(sb);
	}
}
