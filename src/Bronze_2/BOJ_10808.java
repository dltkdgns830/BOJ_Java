package Bronze_2;

import java.io.*;
import java.util.*;

public class BOJ_10808 {
	 public static void main(String[] args) throws IOException {
        
   		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input = br.readLine();
		int[] alphabet = new int[26];
		
		for (int i = 0; i < input.length(); i++) {
			alphabet[input.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < alphabet.length; i++) {
			bw.append(alphabet[i] + " ");
		}
		 
		bw.flush();
    }
}
