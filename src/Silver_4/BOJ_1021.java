package Silver_4;

import java.io.*;
import java.util.*;

 
public class BOJ_1021 {
	public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/workspace/BOJ/src/input.txt");
		BufferedReader br = new BufferedReader(reader);
		LinkedList<Integer> d = new LinkedList<Integer>();
		StringTokenizer st; 
		st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i <= n; i++) {
			d.offer(i);
		}
		
		st = new StringTokenizer(br.readLine(), " ");
		
		int[] count = new int[m];
		int result = 0;
		
		for (int i = 0; i < m; i++) {
			count[i] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < m; i++) {
			int target = d.indexOf(count[i]);
			int half;
			
			if(d.size() % 2 == 0) {
				half = d.size() / 2 - 1;
			}
			else {
				half = d.size() / 2;
			}
			
			if(target <= half) {
				for(int j = 0; j < target; j++) {
					int temp = d.pollFirst();
					d.offerLast(temp);
					result++;
				}
			} else {
				for (int j = 0; j < d.size() - target; j++) {
					int temp = d.pollLast();
					d.offerFirst(temp);
					result++;
				}
			}
			
			d.pollFirst();
		}
		System.out.print(result);
	}
}