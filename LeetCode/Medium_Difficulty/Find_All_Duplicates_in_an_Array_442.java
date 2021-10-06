package Medium_Difficulty;

import java.util.ArrayList;
import java.util.Arrays;

public class Find_All_Duplicates_in_an_Array_442 {
	public ArrayList<Integer> findDuplicates(int[] nums) {        
        ArrayList<Integer> answer = new ArrayList<>();
        if(nums.length == 1) {
        	return answer;
        }
        
        int[] freq = new int[nums.length];
        
        for(int pointer = 0; pointer<nums.length; pointer++) {
        	int correspondingIndex = nums[pointer] - 1;
        	freq[correspondingIndex]++;
        	
        	if(freq[correspondingIndex]>1) {
        		answer.add(nums[pointer]);
        	}
        }
        
        return answer;
	}
}
