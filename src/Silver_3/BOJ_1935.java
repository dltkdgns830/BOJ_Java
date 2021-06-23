package Silver_3;

import java.io.*;
import java.util.*;

public class BOJ_1935 {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		double[] operand = new double[n]; 
		char[] inputVal = br.readLine().toCharArray(); 
		Stack<Double> stack = new Stack<>(); 
        
		for(int i=0; i<n; i++) {
			operand[i] = Integer.parseInt(br.readLine());
		}
        
		for(int i=0; i<inputVal.length; i++) {
            
			if(Character.isAlphabetic(inputVal[i])) {
				int index = (int)inputVal[i]-65;
				stack.push(operand[index]);
			} else {
                
				Double result = 0.d;
				Double pop1 = stack.pop();
				Double pop2 = stack.pop();
                
				if(inputVal[i]=='+') {
					result = pop2 + pop1;
				}
				if(inputVal[i]=='-') {
					result = pop2 - pop1;
				}
				if(inputVal[i]=='*') {
					result = pop2 * pop1;
				}
				if(inputVal[i]=='/') {
					result = pop2 / pop1;
				}
                
				stack.push(result);
			}
		}
		System.out.format("%.2f", stack.pop());
	}
}
