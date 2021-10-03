/* 
TIME LIMIT EXCEEDED

package Medium_Difficulty;

import java.util.Scanner;

public class Jump_Game_55 {
	static boolean flag;
	
	public static void performJumps(int[] array, int maxIndex, int currIndex) {
		//-ve Base case
		if(currIndex > maxIndex) {
			return;
		}
		
		//+ve Base Case
		if(currIndex == maxIndex) {
			System.out.println("true");
			System.exit(0);
		}
		
		int maxJump = array[currIndex];
		
		for(int i = maxJump; i>=1; i--) {
			if(flag == false) {
				performJumps(array, maxIndex, currIndex + i);
			}
		}
		
		return;
	}
	
	public static boolean canJump(int[] array) {
		if(array.length == 1) {
			return true;
		}
		
		flag = false;
		performJumps(array, array.length - 1, 0);
		
		if(flag == true) {
			return true;
		}else {
			return false;
		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println(canJump(array));
	}

}

TIME LIMIT EXCEEDED
*/
