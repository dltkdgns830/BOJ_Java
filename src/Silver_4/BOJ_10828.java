package Silver_4;

import java.util.*;
import java.io.*;

public class BOJ_10828 {
    
    public static void main(String[] args) throws IOException {
        
        Scanner stdIn = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int TestCase = stdIn.nextInt();
        int[] stack = new int[TestCase];
        int size = 0;
        
        while(TestCase-- > 0) {
            String cmd = stdIn.next();
            
            if (cmd.equals("push")) {
                int num = Integer.parseInt(stdIn.next());
                stack[size] = num;
                size++;
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack[size-1]+"\n");
                    size--;
                }
            } else if (cmd.equals("size")) {
                bw.write(size + "\n");
            } else if (cmd.equals("empty")) {
                if (size == 0) {
                    bw.write("1\n");
                } else {
                    bw.write("0\n");
                }
            } else if (cmd.equals("top")) {
                if (size == 0) {
                    bw.write("-1\n");
                } else {
                    bw.write(stack[size-1]+"\n");
                }
            }
        }
        bw.flush();
    }
}
