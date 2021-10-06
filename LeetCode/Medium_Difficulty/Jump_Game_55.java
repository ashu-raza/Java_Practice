package Medium_Difficulty;

import java.util.Scanner;

public class Jump_Game_55 {
    static int[] array;
    
	public static boolean canJump(int[] nums) {        
        array = nums;
        
        if(nums.length == 1) {
        	return true;
        }
        
		for(int i = 0; i<nums.length; i++) {
        	if(nums[i] == 0) {
        		if(canBypassThisZero(i) == true) {
        			continue;
        		}else {
        			return false;
        		}
        	}
        }
        
		return true;
    }
	
	public static boolean canBypassThisZero(int position) {
		for(int i = position - 1; i>=0; i--) {
			int distance = position - i;
			if(array[i] > distance) {
				return true;
			}else {
				continue;
			}
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums = {3,6,1,0,1,1,0,7};
		
		System.out.println(canJump(nums));
	}
}

