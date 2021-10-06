package Medium_Difficulty;

import java.util.Scanner;

public class Longest_Substring_Without_Repeating_Characters_3 {
	
	public static boolean isValid(String str) {
		int[] frequency = new int[128];
		
		for(int i = 0; i<str.length(); i++) {
			int currCH = str.charAt(i);
			frequency[currCH]++;
		}
		
		for(int i = 0; i<128; i++) {
			if(frequency[i]>1) {
				return false;
			}
		}
		
		return true;
	}
	
	public static int lengthOfLongestSubstring(String input) {
        if(input.length()<2) {
        	return input.length();
        }
		
        int answer = 0;
        
		int leftPointer = 0;
        int rightPointer = 1;
        
        while(rightPointer < input.length()) {
        	String currSubString = input.substring(leftPointer, rightPointer + 1);
        	
        	if(isValid(currSubString) == false) {
        		while(isValid(currSubString) == false) {
        			leftPointer++;
        			currSubString = input.substring(leftPointer, rightPointer + 1);
        		}
        	}
        	
        	answer = Math.max(answer, currSubString.length());
        	rightPointer++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		System.out.println(lengthOfLongestSubstring(input));
	}

}
