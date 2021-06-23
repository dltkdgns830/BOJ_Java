package Bronze_4;

import java.util.Scanner;

public class BOJ_4299 {
    public static void main(String[] args) {
     
        Scanner stdIn = new Scanner(System.in);
        
        int add = stdIn.nextInt();
        int dif = stdIn.nextInt();
        
        if ((add-dif) < 0 || (add+dif) % 2 != 0) System.out.println("-1");
        
        else {
            int aScore = (add+dif) / 2;
            int bScore = (add-dif) / 2;
            
            System.out.println(aScore + " " + bScore);
        }
        
    }
}
