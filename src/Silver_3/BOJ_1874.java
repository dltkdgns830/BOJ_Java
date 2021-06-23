package Silver_3;

import java.util.*;

public class BOJ_1874 {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        solve(a);
    }
    
    public static void solve(int[] a) {

        Stack<Integer> stack = new Stack<Integer>();
        int m = 0; // stack에 제일 최근에 들어간 수
        StringBuilder sb = new StringBuilder();
        
        for(int x : a) {
            if (x > m) {
                while (x > m) { // x == m 일때까지 push
                    stack.push(++m);
                    sb.append("+\n");
                }
                stack.pop(); // m pop 해줌
                sb.append("-\n");
            } else {
                if (stack.peek() != x) { // x < m 이면 불가능한 배열
                    System.out.println("NO");
                    return;
                }
                stack.pop(); // x == m 일 경우 하나 pop 해줌 
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}

