package Recursion;

import java.util.Scanner;

public class Generate_Binary_Strings {
	public static void genBinarySubString(String input, String output) {
		//Base Case
		if(input.length() == 0) {
			System.out.print(output + " ");
			return;
		}
		
		char C0 = input.charAt(0);
		
		if(C0 == '?') {
			genBinarySubString(input.substring(1), output + '0');
			genBinarySubString(input.substring(1), output + '1');
		}else {
			genBinarySubString(input.substring(1), output + C0);
		}
		return;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			String str = sc.next();
			genBinarySubString(str, "");
			System.out.println();
			T--;
		}
	}

}
