package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_11726 {
	 public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int input = Integer.parseInt(br.readLine());
        int[] d = new int[input+1];
		 
        d[1] = 1;
		d[2] = 2;
        for (int i=3; i <= input; i++) {
            d[i] = d[i-1] + 2 * d[i-2];  
			d[i] %= 10007;
        }
        System.out.println(d[input]);
    }
}
	