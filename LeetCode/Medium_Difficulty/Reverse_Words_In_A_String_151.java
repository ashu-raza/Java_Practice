package Medium_Difficulty;

import java.util.Scanner;

public class Reverse_Words_In_A_String_151 {
	public static String reverseWords(String s) {
		s = s.trim();
		
		String output = new String("");

		String word = new String("");
		int head;
		int tail = s.length();
		boolean spaceFlag = false;
		
		for(int curr = s.length() - 1; curr>=0; curr--) {
			char ch = s.charAt(curr);
			
			if(ch == ' ' && spaceFlag == false) {
				spaceFlag = true;
				head = curr + 1;
				
				word = s.substring(head, tail) + " ";					
				output = output.concat(word);
				
				tail = curr; 
			}else if(ch == ' ' && spaceFlag == true) {
				tail--; 
			}else {
				spaceFlag = false;
			}
		}
		
		word = s.substring(0,tail);
		output = output.concat(word);
    
        return output;            
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(reverseWords(input));
	}
}
