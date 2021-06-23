package Bronze_2;

import java.util.Scanner;

public class BOJ_1152 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        String input = stdIn.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
    }
}