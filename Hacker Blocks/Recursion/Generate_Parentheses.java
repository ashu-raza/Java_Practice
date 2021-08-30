package Recursion;

import java.util.Scanner;

public class Generate_Parentheses {
	static int N;
	
	public static boolean isBalanced(String input) {
		int sum = 0;
		boolean result = true;

		for(int i = 0; i<input.length(); i++) {
			if(input.charAt(i) == '(') { //encountering a opening paranthesis
				sum++;
			}
			
			if(input.charAt(i) == ')') { //encountering a closing parenthesis
				if(sum == 0) {
					result = false;
					break;
				}else{
					sum--;
				}
			}
		}
		
		return result;
	}
	
	public static void genBalancedParenthesis(int openersUsed, int closersUsed, String output) {
		if(output.length() == 2*N) {
			if(isBalanced(output)) {
				System.out.println(output);
				return;
			}
			return;
		}
		
		if(closersUsed<N) {
			genBalancedParenthesis(openersUsed, closersUsed+1, output + ")");
		}
		if(openersUsed<N) {
			genBalancedParenthesis(openersUsed+1, closersUsed, output + "(");
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		genBalancedParenthesis(0, 0, "");

	}
}
