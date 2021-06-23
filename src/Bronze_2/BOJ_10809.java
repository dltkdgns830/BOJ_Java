package Bronze_2;

import java.util.Scanner;
import java.util.Arrays;

public class BOJ_10809 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        String input = stdIn.nextLine(); // a: 97 z : 122
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        
        for (int i = 0; i < input.length(); i++) {
            
            char ch = input.charAt(i);
            if (alphabet[ch - 'a'] == -1) {
                alphabet[ch - 'a'] = i;
            }
            
        }
        
        for (int i = 0; i< alphabet.length; i++) {
            System.out.printf("%d ",alphabet[i]);
        }
    }
}
