package Silver_3;

import java.util.*;
import java.io.*;

public class BOJ_17413 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean tag = false;
        Stack<Character> s = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '<') { // 태그 시작이니깐 < tag true로 변경 후 그대로 출력
                print(bw, s);
                tag = true;
                bw.write(ch);
            } else if (ch == '>') {
                tag = false; // 태그 끝났으니깐 > 그대로 출력
                bw.write(ch);
            } else if (tag) { // 태그 안이니깐 그대로 출력
                bw.write(ch);
            } else {
                if (ch == ' ') { // 
                    print(bw, s); // 공백 전까지 단어 뒤집어서 출력
                    bw.write(ch); // 공백 출력
                } else {
                    s.push(ch); // 뒤집을 숫자 stack에 넣기
                }
            }
        }
        print(bw, s);
        bw.write("\n");
        bw.flush();
    }
    
    static void print(BufferedWriter bw, Stack<Character> s) throws IOException {
        while (!s.isEmpty()) {
            bw.write(s.pop());
        }
    }
}

