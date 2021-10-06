/* 
TIME LIMIT EXCEEDED

package Hard_Difficulty;

import java.util.Scanner;

public class Dungeon_Game_174 {
	static int[][] grid;
	
	static int minNegativePeak;
	
	public static void bestWay(int currRow, int currCol, int currSum, int currNegativePeak) {
		if(minNegativePeak == 0) {
			return;
		}
		
		if(currRow >= grid.length || currCol >= grid[0].length) {
			return;
		}
		
		currSum = currSum + grid[currRow][currCol];
		currNegativePeak = Math.min(currNegativePeak, currSum);
		
		if(currRow == grid.length - 1 && currCol == grid[0].length - 1) {
			minNegativePeak = Math.max(minNegativePeak, currNegativePeak);
			System.out.println(minNegativePeak + " " + currNegativePeak);
			return;
		}

		//Move Rightwards
		bestWay(currRow, currCol+1, currSum, currNegativePeak);
		
		//Move Downwards
		bestWay(currRow+1, currCol, currSum, currNegativePeak);
	}
	
	public static int calculateMinimumHP(int[][] dungeon) {
        grid = dungeon;
        minNegativePeak = Integer.MIN_VALUE;
        
        bestWay(0,0,0,0);
        
        int answer = 1 - minNegativePeak;
        
        return answer;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] input = {{-2,-3,3},{-100,-100,1},{-100,-100,-5}};
		System.out.println(calculateMinimumHP(input));
	}
}

TIME LIMIT EXCEEDED
*/
