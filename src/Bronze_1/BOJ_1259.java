package Bronze_1;

import java.io.*;
import java.util.*;

public class BOJ_1259 {
	 public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		while (true){
			String s = br.readLine();
			
			if (s.equals("0")) break;
			String p = "";
			
			for (int i = s.length() - 1; i >= 0; i--) {
				p += s.charAt(i) + "";
			}
			
			if (p.equals(s)) System.out.println("yes");
			else System.out.println("no");
		}
    }
}

