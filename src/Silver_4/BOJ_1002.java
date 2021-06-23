package Silver_4;

import java.util.Scanner;
 
public class BOJ_1002 {
	public static void main(String[] args) {
 
		Scanner stdIn = new Scanner(System.in);
 
 
		int T = stdIn.nextInt();
 
		while (T-- > 0) {
 
			int x1 = stdIn.nextInt();
			int y1 = stdIn.nextInt();
			int r1 = stdIn.nextInt();
 
			int x2 = stdIn.nextInt();
			int y2 = stdIn.nextInt();
			int r2 = stdIn.nextInt();
			
			System.out.println(tangent_point(x1, y1, r1, x2, y2, r2));
		}
 
	}
 
 
	// 접점 개수 구하는 함수
	public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
    
		int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 중점간 거리 distance의 제곱 
 
 
		// 개수 무한대 - 원 일치
		if(x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		
		// 원이 서로 떨어져 있을 때
		else if(distance_pow > Math.pow(r1 + r2, 2)) {
			return 0;
		}
 
		// 원 안에 원 있는데 내접 X 
		else if(distance_pow < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		
		// 내접
		else if(distance_pow == Math.pow(r2 - r1, 2)) {
			return 1;
		}
        
		
		// 외접
		else if(distance_pow == Math.pow(r1 + r2, 2)) {
			return 1;
		}
		
		else { // 나머지는 교점 2개
			return 2;
		}
		
	}
 
}
