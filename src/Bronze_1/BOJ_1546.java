package Bronze_1;

import java.util.Scanner;

public class BOJ_1546 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        double[] array = new double[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = stdIn.nextInt();
        }
        
        double max = array[0];
        
        for (int i = 0; i < n; i++) {
            if (array[i] > max) max = array[i];
        }
        
        for (int i = 0; i < n; i++) {
            
            array[i] = array[i] / max * 100.0;
            if (array[i] == max) continue;
            
        }
        
        double sum = 0;
       
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }
        
        double avg = sum / (double) n;
        System.out.println(avg);
        
    }
}
