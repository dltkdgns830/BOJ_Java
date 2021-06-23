package Silver_4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        StringTokenizer stN = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stN.nextToken());
        }
       
        Arrays.sort(a);

        int m = Integer.parseInt(br.readLine());
        StringTokenizer stM = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            
            int index = Arrays.binarySearch(a, Integer.parseInt(stM.nextToken()));
            if (index < 0) bw.append(String.valueOf(0));
            else bw.append(String.valueOf(1));
            bw.append("\n");
        }

        bw.flush();
        br.close();
        bw.close();
    }
}