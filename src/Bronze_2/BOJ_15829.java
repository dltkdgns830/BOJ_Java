package Bronze_2;

import java.io.*;
import java.util.*;

 
public class BOJ_15829 {
	public static void main(String[] args) throws IOException {
    
		FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
    
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		long hash = 0L;
		long mod = 1234567891L;	
		long R = 1;
		
		for (int i = 0; i < s.length(); i++) { 
            long alphabet = s.charAt(i) - 'a' + 1;
            hash += (alphabet * R) % mod; 
            R = (R * 31) % mod;
        }
 		hash %= mod;
		System.out.println(hash);
	}
 
}