package Silver_3;

import java.util.*;
import java.io.*;

public class BOJ_1406 {
    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Stack<Character> left = new Stack<Character>();
        Stack<Character> right = new Stack<Character>();
        
        for (int i=0; i<s.length(); i++) { // 왼쪽 stack에 문자열 다 push 해줌
            left.push(s.charAt(i));
        }
        
        int m = Integer.parseInt(br.readLine());
        
        while (m-- > 0) {
            String[] line = br.readLine().split(" ");
            char cmd = line[0].charAt(0);
            
            if (cmd == 'L') {
                if (!left.empty()) {
                    right.push(left.pop());
                }
            } else if (cmd == 'D') {
                if (!right.empty()) {
                    left.push(right.pop());
                }
            } else if (cmd == 'P') {
                char c = line[1].charAt(0);
                left.push(c);
            } else if (cmd == 'B') {
                if (!left.empty()) {
                    left.pop();
                }
            }
        }
        
        while (!left.empty()) { // 출력을 위해 오른쪽에 다시 넣어줌
            right.push(left.pop());
        }
        
        StringBuilder sb = new StringBuilder();
        
        while (!right.empty()) {
            sb.append(right.pop());
        }
        System.out.println(sb);
    }
}
