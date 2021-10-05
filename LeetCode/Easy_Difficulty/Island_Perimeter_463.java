package Easy_Difficulty;

import java.util.Scanner;

public class Island_Perimeter_463 {
	static int[][] input;
	
	public static int sidesExposedToWater(int row, int col) {
		int sides = 0;
		
		//Look North
		if(row == 0) {
			sides++;
		}else {
			if(input[row - 1][col] == 0) {
				sides++;
			}
		}
		
		//Look South
		if(row == input.length - 1) {
			sides++;
		}else {
			if(input[row + 1][col] == 0) {
				sides++;
			}
		}
		
		//Look West
		if(col == 0) {
			sides++;
		}else {
			if(input[row][col - 1] == 0) {
				sides++;
			}
		}
				
		//Look East
		if(col == input[0].length - 1) {
			sides++;
		}else {
			if(input[row][col + 1] == 0) {
				sides++;
			}
		}
		
		return sides;
	}
	
	public static int islandPerimeter(int[][] grid) {
        input = grid;
		int answer = 0;
        
		for(int row = 0; row<grid.length; row++) {
        	for(int col = 0; col<grid[0].length; col++) {
        		if(grid[row][col] == 1) {
        			answer = answer + sidesExposedToWater(row, col);
        		}else {
        			continue;
        		}
        	}
        }
		
		return answer;
    }
}
