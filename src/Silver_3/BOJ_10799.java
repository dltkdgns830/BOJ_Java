package Silver_3;

import java.util.*;

public class BOJ_10799 {
    public static void main(String args[]) {
        
        Scanner stdIn = new Scanner(System.in);
        String s = stdIn.next();
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            
            if (s.charAt(i) == '(') {
                stack.push(i);
            }
            
            else {
                if (stack.peek() == (i - 1)) {
                    count += (stack.size() - 1);
                    stack.pop();
                }
                else {
                    count++;
                    stack.pop();
                }
            }
        }
        System.out.print(count);
    }
}
