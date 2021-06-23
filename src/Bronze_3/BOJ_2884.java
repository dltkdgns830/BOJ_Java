package Bronze_3;

import java.util.Scanner;

public class BOJ_2884 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int hour = stdIn.nextInt();
        int minute = stdIn.nextInt();
        
        if (minute >= 45) {
            minute = minute - 45;
        }
        
        else {
            minute = minute + 15;
            
            if (hour == 0) hour = 23;
            else hour -= 1;
        }
        
        System.out.println(hour + " " + minute);
        
    }
    
}