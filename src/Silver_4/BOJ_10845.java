package Silver_4;

import java.util.*;
import java.io.*;

public class BOJ_10845 {
    public static void main(String args[]) throws IOException {
        
        Scanner stdIn = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = stdIn.nextInt();
        int[] queue = new int[n];
        int begin = 0;
        int end = 0;
        
        while (n-- > 0) {
            String cmd = stdIn.next();
            if (cmd.equals("push")) {
                int num = Integer.parseInt(stdIn.next());
                queue[end++] = num;
            } else if (cmd.equals("front")) {
                if (begin == end) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[begin] + "\n");
                }
            } else if (cmd.equals("size")) {
                bw.write(end-begin + "\n");
            } else if (cmd.equals("empty")) {
                if (begin == end) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd.equals("pop")) {
                if (begin == end) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[begin] + "\n");
                    begin += 1;
                }
            } else if (cmd.equals("back")) {
                if (begin == end) {
                    bw.write("-1\n");
                } else {
                    bw.write(queue[end - 1] + "\n");
                }
            }
        }
        
        bw.flush();
    }
}

