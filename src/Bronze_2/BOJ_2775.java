package Bronze_2;

import java.util.Scanner;

public class BOJ_2775 {
    
    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        int TestCase = stdIn.nextInt();
        
        for (int i = 0; i < TestCase; i++) {
            
            int floor = stdIn.nextInt();
            int roomNum = stdIn.nextInt();
            int result = peopleNum(floor,roomNum);
        
            System.out.println(result);
        }
    }
    
    private static int peopleNum(int k, int n) {
        
        if (n == 0)
            return 0;
        
        else if (k == 0)
            return n;
        
        else {
            return peopleNum(k, n - 1) + peopleNum(k - 1, n);
        }
    }
}
