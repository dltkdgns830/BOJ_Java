package Silver_5;

import java.io.*;
import java.util.*;

public class BOJ_1436 {
	public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int n = Integer.parseInt(br.readLine());
		int count = 1;
		int num = 666;
		
		while (count != n) {	
			num++;
			if(String.valueOf(num).contains("666")) count++;
		}
		
		System.out.print(num);
		
    }

}
