package Bronze_1;

import java.util.Scanner;

public class BOJ_1157 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        String input = stdIn.next();
        int[] check = new int[26];
        
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 'a') check[input.charAt(i) - 'a']++;
            else check[input.charAt(i) - 'A']++;
        }
        
        int max = -1;
        int flag = 0;
        int maxChar = 0;
        int count = 0;
        
        for (int i = 0; i < check.length; i++) {
            if (max < check[i]) max = check[i];
        }
        
        for (int i = 0; i < check.length; i++) {
            if (max == check[i]) {
                count++;
                maxChar = i;
            }
        }
        
        if (count > 1) flag = 1;
        
        if (flag == 1) System.out.print("?");
        else System.out.printf("%c",maxChar + 'A');
    }
}
