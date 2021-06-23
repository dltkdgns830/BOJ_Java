package Silver_5;

import java.util.Scanner;

public class BOJ_2941 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        String input = stdIn.nextLine();
        int count = 0;
        
       for (int i = 0; i < input.length(); i++) {
                
            if (i < input.length() - 1 && input.charAt(i) == 'c') {
                if (input.charAt(i+1) == '=') { // c=
                    i++;
                }
                else if (input.charAt(i+1) == '-') { // c-
                    i++;
                }
            }
            
            else if (input.charAt(i) == 'd') {
                if (i < input.length() - 1 && input.charAt(i+1) == 'z') { // dz=
                    if (i < input.length() - 2 && input.charAt(i+2) == '=') {
                        i += 2;
                    }
                }
            else if (i < input.length() - 1 && input.charAt(i+1) == '-') { // d-
                    i++;
                }
            }
            
            else if (i < input.length() - 1 && input.charAt(i) == 'l') {
                if (input.charAt(i+1) == 'j') { // lj
                    i++;
                }
            }
           
            else if (i < input.length() - 1 && input.charAt(i) == 'n') {
                if (input.charAt(i+1) == 'j') { // nj
                    i++;
                }
            }
           
           else if (i < input.length() - 1 && input.charAt(i) == 's') {
                if (input.charAt(i+1) == '=') { // s=
                    i++;
                }
            }
           
           else if (i < input.length() - 1 && input.charAt(i) == 'z') {
                if (input.charAt(i+1) == '=') { // z=
                    i++;
                }
            }
           
            count++;
        }
        
        System.out.print(count);
    }
}