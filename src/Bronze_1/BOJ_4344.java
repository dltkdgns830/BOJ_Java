package Bronze_1;

import java.util.Scanner;

public class BOJ_4344 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int TestCaseNum = stdIn.nextInt();
        
        for (int i = 0; i < TestCaseNum; i++) {
            
            int[] TestCase = new int[stdIn.nextInt()]; // 인원 수 입력
            int sum = 0;
            int count = 0;
            
            for (int j = 0; j < TestCase.length; j++) {
                
                TestCase[j] = stdIn.nextInt();
            } // 입력 받음
                
            for (int j = 0; j < TestCase.length; j++) {
                    sum += TestCase[j];                    
                } // 합계 계산
            int avg = sum /TestCase.length;
                
            for (int j = 0; j < TestCase.length; j++) {
                if (TestCase[j] > avg) count++;
            } // 평균 넘은 학생 수
            
            double percentage = (double) count / (double) TestCase.length * (double) 100;
            System.out.println(String.format("%.3f%%",percentage));
                
            }
        }
        
    }
