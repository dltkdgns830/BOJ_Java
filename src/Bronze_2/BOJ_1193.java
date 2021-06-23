package Bronze_2;

import java.util.Scanner;

public class BOJ_1193 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int input = stdIn.nextInt();
        
        int order = input - add(lineNum(input)-1);
        int x , y = 0;
        
        if (lineNum(input) % 2 == 0) {
            x = order;
            y = lineNum(input) - x + 1;
        }
        
        else {
            y = order;
            x = lineNum(input) - y + 1;
        }
        
        System.out.print(x + "/" + y);
    }
    
    public static int lineNum(int input) {
        
        int i = 1;
        int count = 0;
        while (true) {
            input -= i;
            
            i++;
            count++;
            if (input <= 0) break;

            }
        
        return count;
        }
    
    public static int add(int input) {
        int sum = 0;
        for (int i = 1; i <= input; i++) {
            sum += i;
        }
        
        return sum;
    }
    }
