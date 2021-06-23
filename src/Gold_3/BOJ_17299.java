package Gold_3;

import java.util.*;
import java.io.*;

public class BOJ_17299 {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];
        int[] frq = new int[1000001];
        
        
        String[] temp = bf.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(temp[i]);
            frq[a[i]]++;
        }
        
        Stack<Integer> s = new Stack<>();
        s.push(0);
        
        for (int i = 1; i < n; i++) {
            if (s.isEmpty()) {
                s.push(i);
            }
            while (!s.isEmpty() && frq[a[s.peek()]] < frq[a[i]]) {
                ans[s.pop()] = a[i];
            }
            s.push(i);
        }
        
        while (!s.empty()) {
            ans[s.pop()] = -1;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i=0; i<n; i++) {
            bw.write(ans[i] + " ");
        }
        
        bw.write("\n");
        bw.flush();
    }
}
