package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_9095 {
	 public static void main(String[] args) throws IOException {
        
   		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
         
        while(T-- > 0) {
            int[] d = new int[12];
            int input = Integer.parseInt(br.readLine());
		 
            d[0] = 1;
		    d[1] = 1;
            d[2] = 2;
            for (int i=3; i <= input; i++) {
                d[i] = d[i-1] + d[i-2] + d[i-3];
        
            }
            System.out.println(d[input]);
        }
    }
}
	