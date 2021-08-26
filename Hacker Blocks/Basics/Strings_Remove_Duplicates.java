package Basics;

import java.util.Scanner;

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String ans = new String();
		
		int l = str.length();
		
		for(int i = 0; i<=l-2; i++) {
			if(str.charAt(i) == str.charAt(i+1)){
				continue;			
			}
			
			ans = ans.concat(str.substring(i,i+1));
		}
		
		ans = ans.concat(str.substring(l-1,l));
		System.out.println(ans);
	}

}
