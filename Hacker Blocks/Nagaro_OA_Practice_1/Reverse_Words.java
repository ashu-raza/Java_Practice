package Nagaro_OA_Practice_1;

import java.util.Scanner;

public class Reverse_Words {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0) {
			Scanner newSC = new Scanner(System.in);
			String input = newSC.nextLine();
			
			input = input.trim();
			
			String output = new String("");

			String word = new String("");
			int head;
			int tail = input.length();
			boolean spaceFlag = false;
			
			for(int curr = input.length() - 1; curr>=0; curr--) {
				char ch = input.charAt(curr);
				
				if(ch == ' ' && spaceFlag == false) {
					spaceFlag = true;
					head = curr + 1;
					
					word = input.substring(head, tail) + " ";					
					output = output.concat(word);
					
					tail = curr; 
				}else if(ch == ' ' && spaceFlag == true) {
					tail--; 
				}else {
					spaceFlag = false;
				}
			}
			
			word = input.substring(0,tail);
			output = output.concat(word);
			
			System.out.println(output);
			
			T--;
		}
	}

}
