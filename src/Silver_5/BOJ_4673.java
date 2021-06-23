package Silver_5;

public class BOJ_4673 {
    
    public static void main(String[] args) {
        
        boolean[] array = new boolean[10001];
        
        for (int i = 1; i < 10001; i++) {
            int n = calc(i);
            
            if (n < 10001) array[n] = true;
        }
        
        for (int i = 1; i < 10001; i++) {
            
            if (!array[i]) {
                System.out.println(i);
            }
        }
    }
    
    public static int calc(int number) {
        
        int sum = number;
        
        while(number != 0) {
            sum = sum + (number % 10);
            number /= 10;
        }
        
        return sum;
    }
}
