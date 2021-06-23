package Silver_5;

import java.util.Scanner;

public class BOJ_1316 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        int count = 0;
        
        for (int i = 0; i < TestCase; i++) {
            
            String input = stdIn.next();

            if (check(input) == true) count++;
        }
        
        System.out.print(count);
    }
    
    public static boolean check(String input) {
                    
        boolean[] check = new boolean[26];
        int prev = 0;
        
        for (int i = 0; i < input.length(); i++) {
                
            int now = input.charAt(i);
            
            if (prev != now) { // 앞에 문자와 지금 문자가 같을 때
                    
                if (check[now - 'a'] == false) { // 처음 나온 문자일 때
                    
                    check[now - 'a'] = true;
                    prev = now;
                        
                }
                
                else return false;
            }
            
            else continue;
        }
        
        
        return true;
    }
}
