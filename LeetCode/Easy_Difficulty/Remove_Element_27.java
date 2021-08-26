package Easy_Difficulty;

import java.util.Scanner;
import java.util.Arrays;

public class Remove_Element_27 {
	public static void removeElement(int[] nums, int val) {
        Arrays.sort(nums);
	    
        int clusterLength = 0;
	    int startInd = -1;
        int endInd = -1;
		       
        for(int i=0; i<nums.length; i++){
		    if(nums[i] == val){
		        if(clusterLength == 0){
		            startInd = i;
		        }
		        clusterLength++;  
		    }
	    }
    
        if(clusterLength == 0){
            for(int ele: nums) {
            	System.out.print(ele + " ");
            }
        	return;
        }
		  
        endInd = startInd + clusterLength - 1;
        
		int count = 1;
        
		for(int i = startInd; i<=endInd; i++){
		    nums[i] = nums[nums.length-count];
		    nums[nums.length-count] = val;
		    count++;
		}
		
		for(int ele: nums) {
        	System.out.print(ele + " ");
        }
		return;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] nums = new int[N];
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();
		}
		
		int val = sc.nextInt();
		
		removeElement(nums, val);
	}

}
