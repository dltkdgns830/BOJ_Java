package Silver_1;

import java.util.Scanner;
 
public class BOJ_11729 {
 
	public static StringBuilder sb = new StringBuilder();
 
	public static void main(String[] args) {
        
		Scanner stdIn = new Scanner(System.in);
 
		int N = stdIn.nextInt();
 
		sb.append((int) (Math.pow(2, N) - 1)).append('\n'); // 최소 2^N - 1번 소요
 
		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
 
	}
 
	/*
		N : 원판의 개수 
		start : 출발지 
		mid : 옮기기 위해 이동해야 장소 
		to : 목적지
	 */
 
	public static void Hanoi(int N, int start, int mid, int to) {
		
		if (N == 1) {
			sb.append(start + " " + to + "\n"); // 1개를 출발지에서 목적지로 이동
			return;
		}
		// STEP 1 : N-1개를 A에서 B로 쌓기
		Hanoi(N - 1, start, to, mid);
		
		// STEP 2 : 젤 큰 거 맨 오른쪽으로 이동
		sb.append(start + " " + to + "\n");
		
		// STEP 3 : N-1개를 B에서 C로 이동 
		Hanoi(N - 1, mid, start, to);
 
	}
}
