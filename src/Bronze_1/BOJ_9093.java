package Bronze_1;

import java.util.*;
import java.io.*;

public class BOJ_9093 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int TestCase = Integer.parseInt(bf.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (TestCase-- > 0) {
            
            String str = bf.readLine() + "\n"; // 마지막 단어도 pop을 해줘야 하기 때문에 추가
            Stack<Character> s = new Stack<>();
            
            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') { // 공백 확인
                    while (!s.isEmpty()) { // 그 단어가 빌 때까지 pop을 해서 bw에 저장
                        bw.write(s.pop()); 
                    }
                    bw.write(ch); // 단어가 비었으니 줄 바꿈
                } else {
                    s.push(ch); // 공백이 아니면 스택에 push
                }
            }
        }
        bw.flush();
    }
}
