package Nagaro_OA_Practice_1;

import java.util.Scanner;

public class Sum_of_numbers_in_string {
	public static int stringToNumber(String input) {
		int output = 0;
		
		for(int i = 0; i < input.length(); i++) {
			int digit = input.charAt(i) - 48;
			output = (10*output) + digit; 
		}
		
		return output;
	}
	
	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		
		int T = sc1.nextInt();
		
		while(T>0) {
			Scanner sc2 = new Scanner(System.in).useDelimiter("\n");
			String str = sc2.next();
			str = str.trim();
			
			int answer = 0;
			
			String numberString = new String("");
			int start = 0;
			int end = 0;
			boolean numberFlag = false;
			
			for(int curr = 0; curr<str.length(); curr++) {
				int ch = str.charAt(curr);
				
				if(ch>= 48 && ch <= 57) {
					if(numberFlag == false) {
						start = curr;
						end = curr;
						numberFlag = true;
					}else {
						end = curr;
					}
				}else{
					if(numberFlag == true) {
						numberString = str.substring(start, end + 1);
						
						answer = answer + stringToNumber(numberString); 
					}
					
					numberFlag = false;
				}
			}
			
			if(numberFlag == true) {
				numberString = str.substring(start, end + 1);
				answer = answer + stringToNumber(numberString); 
			}
			
			System.out.println(answer );
			T--;
		}

	}
}
