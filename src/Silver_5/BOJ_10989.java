package Silver_5;

import java.io.*;
import java.util.*;

public class BOJ_10989 {
    public static void main(String[] args) throws IOException {
        
        int[] cnt = new int[10001];
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
        int N = Integer.parseInt(br.readLine());
 
        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())] ++;
        }
 
        StringBuilder sb = new StringBuilder();
 
        // 0은 입력범위에서 없으므로 1부터 시작
        for(int i = 1; i < 10001; i++){
            // i 값이 개수가 0 이 될 때 까지 출력 (빈도수를 의미)
            while(cnt[i] > 0){
                sb.append(i).append('\n');
                cnt[i]--;
            }
        }
        System.out.println(sb);
    }
}
