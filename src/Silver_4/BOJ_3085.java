package Silver_4;

import java.io.*;
import java.util.*;

public class BOJ_3085 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		
		int	n = Integer.parseInt(br.readLine());
		
		char[][] a = new char[n][n];
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		
		int result = 0;
		
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+1 < n) {
                    char t = a[i][j];
					a[i][j] = a[i][j+1]; 
					a[i][j+1] = t;
                    int temp = check(a);
					
                    if (result < temp) result = temp;
					
                    t = a[i][j]; 
					a[i][j] = a[i][j+1]; 
					a[i][j+1] = t;
                }
                if (i+1 < n) {
                    char t = a[i][j]; 
					a[i][j] = a[i+1][j]; 
					a[i+1][j] = t;
                    int temp = check(a);
					
                    if (result < temp) result = temp;
					
                    t = a[i][j]; 
					a[i][j] = a[i+1][j]; 
					a[i+1][j] = t;
                }
            }
        }
		
		System.out.print(result);
	}
	
	public static int check(char[][] a) {
		
		int max = 0;
		int n = a.length;
		
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n - 1; j++) {
				if (a[i][j] == a[i][j+1]) {
					count++;
				} else count = 1;
				if (max < count) max = count;
			}
			
		}
		
		for (int i = 0; i < n; i++) {
			int count = 1;
			for (int j = 0; j < n - 1; j++) {
				if (a[j][i] == a[j+1][i]) {
					count++;
				} else count = 1;
				if (max < count) max = count;
			}
			
		}
		return max;
	}
	
}
