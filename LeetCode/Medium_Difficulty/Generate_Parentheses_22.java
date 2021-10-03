package Medium_Difficulty;

import java.util.ArrayList;

public class Generate_Parentheses_22 {

	static int N;
    static ArrayList<String> validList;
    
    public List<String> generateParenthesis(int n) {
        N = n;
        validList = new ArrayList<>();
        
        genBalancedParenthesis(0,0,"");
        
        return validList;
    }
    
    public static void genBalancedParenthesis(int openersUsed, int closersUsed, String output) {
		if(output.length() == 2*N) {
			if(isBalanced(output)) {
				validList.add(output);
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
}
