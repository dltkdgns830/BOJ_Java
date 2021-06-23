package Bronze_1;

import java.util.Scanner;

public class BOJ_1110 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int N = stdIn.nextInt();
        int firstN = N;
        int count = 0;
        
        while(true) {
            
            count++;
            
            int N_first;
            int N_Second;
            
            if (count == 1 && N < 10) {
                N_first = N;
                N_Second = 0;
            }
            else { 
                N_first = N % 10;
                N_Second = (N - N_first) / 10;
            }
            
            int calc = N_first + N_Second;
            if (calc > 9) calc = calc % 10;
            
            int result = N_first * 10 + calc;
            
            if (result == firstN) break;
            
            N = result;
            
        }
        
        System.out.println(count);
       
    }
}
