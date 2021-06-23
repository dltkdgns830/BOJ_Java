package Bronze_2;

import java.util.Scanner;

public class BOJ_8958 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        String[] QuizCase = new String[TestCase];
        int[] result = new int[TestCase];
        
        for (int i = 0; i < TestCase; i++) {
            QuizCase[i] = stdIn.next();
        }
        
        for (int i = 0; i < QuizCase.length; i++) {
            
            int score = 0;
            int count = 0;
            
            for (int j = 0; j < QuizCase[i].length(); j++) {
                
                if (QuizCase[i].charAt(j) == 'O') count++;
                else count = 0;
                
                score += count;
            }
            System.out.println(score);
        }

    }
    
}
