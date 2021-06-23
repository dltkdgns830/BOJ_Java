package Gold_4;

import java.io.*;
import java.util.*;

public class BOJ_1918 {
    
    public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> s = new Stack<>();
		String input = br.readLine();
		
		for (int i = 0; i < input.length(); i++) {
			
			char in = input.charAt(i);
			
			if (in >= 'A' && in <= 'Z') {
				bw.write(in);
			} else if (in == '(') {
				s.push(in);
			} else if (in == ')') {
				while (!s.isEmpty()) {
					
					if (s.peek() == '(') {
						s.pop();
						break;
					}
					
					bw.write(s.pop());
				}
			} else { 
				while (!s.isEmpty() && priority(s.peek()) >= priority(in)) {
                    bw.write(s.pop());
                }
				s.add(in);
			}
		}
		
		while (!s.isEmpty()) {
			bw.write(s.pop());
		}
		
		bw.flush();
		
    }
	
	  public static int priority(char ch) {
        if (ch == '(') return 0;
        if (ch == '+' || ch == '-') return 1;
        else return 2;
    }


}
