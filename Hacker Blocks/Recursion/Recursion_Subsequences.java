package Recursion;

import java.util.Scanner;

public class Recursion_Subsequences {
	public static int genSubstrings(String input, String output) {
		if(input.length() == 0){
			System.out.print(output + " ");
			return 1;
		}
		
		char C0 = input.charAt(0);
		
		int a = genSubstrings(input.substring(1), output);
		int b = genSubstrings(input.substring(1), output + C0);
		
		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int ans = genSubstrings(str, "");
		System.out.println();
		System.out.println(ans);
	}

}
