package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_1463 {
	 public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int input = Integer.parseInt(br.readLine());
        int[] d = new int[input+1];
		 
        d[1] = 0;
        for (int i=2; i <= input; i++) {
            d[i] = d[i-1] + 1;
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        System.out.println(d[input]);
    }
}
	