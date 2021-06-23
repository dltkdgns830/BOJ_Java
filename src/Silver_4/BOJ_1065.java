package Silver_4;

import java.util.Scanner;

public class BOJ_1065 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int num = stdIn.nextInt();
        boolean[] check = new boolean[1001];
        
        
        if (num < 100) System.out.println(num);
        
        else {
            
            for (int i = 100; i <= num; i++ ) {
                check[i] = calc(i);
            }
            
            int count = 99;
            
            for (int i = 100; i <= num; i++ ) {
                if (check[i]) count++;
            }
            
            if (num == 1000) count--;
            
            System.out.println(count);
        }
        
    }
    
    public static boolean calc(int number) {
        
        int count = 0;
        int[] array = new int[4];
        
        while (number != 0) {
            count++;
            array[count-1] = number % 10;
            number /= 10;
        }
 
        if ((array[2] - array[1]) == (array[1] - array[0])) return true;
        else return false;
        
    }
}