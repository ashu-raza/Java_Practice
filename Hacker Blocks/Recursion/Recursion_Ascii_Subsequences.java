package Recursion;

import java.util.Scanner;

public class Recursion_Ascii_Subsequences {
	public static int genAsciiSubsequences(String input, String output) {
		if(input.length()==0) {
			System.out.print(output + " ");
			return 1;
		}
		
		int recAns1 = genAsciiSubsequences(input.substring(1), output);
		int recAns2 = genAsciiSubsequences(input.substring(1), output + input.charAt(0));
		int recAns3 = genAsciiSubsequences(input.substring(1), output + (int)input.charAt(0));
		
		return recAns1 + recAns2 + recAns3;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int ans = genAsciiSubsequences(str, "");
		System.out.println();
		System.out.println(ans);
	}

}
