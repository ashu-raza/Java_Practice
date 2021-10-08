package Medium_Difficulty;

public class Word_Search_79 {
    static char[][] boardArray;
    static boolean[][] flags;
    static boolean answer;
    
	public static boolean exist(char[][] board, String word) { 	
    	boardArray = board;
		flags = new boolean[board.length][board[0].length];
		
		char firstChar = word.charAt(0);
    	
    	//Traversing the board in search of the first character
    	for(int row = 0; row<board.length; row++) {
    		for(int col = 0; col<board[row].length; col++) {
    			if(board[row][col] == firstChar) {
    				isAnchorValid(row, col, word.substring(1));

    				if(answer == true) {
    					return true;
    				}else {
    					continue;
    				}
    			}
    		}
    	}
    	
    	return false;
    }
    
    public static void isAnchorValid(int anchorRow, int anchorCol, String input) {			
		if(input.length() == 0) {
			answer = true;
			return;
		}

		flags[anchorRow][anchorCol] = true; //set corresponding flag

    	char desiredChar = input.charAt(0);
    		
    	if(anchorRow != 0 && flags[anchorRow-1][anchorCol] != true && answer != true) {
        	//Check North
    		if(boardArray[anchorRow-1][anchorCol] == desiredChar) {
				isAnchorValid(anchorRow-1, anchorCol, input.substring(1));
        	}
    	}
    		
    	if(anchorRow != boardArray.length - 1 && flags[anchorRow+1][anchorCol] != true && answer != true) {
        	//Check South
        	if(boardArray[anchorRow+1][anchorCol] == desiredChar) {
				isAnchorValid(anchorRow+1, anchorCol, input.substring(1));
        	}
    	}
    		
    	if(anchorCol != boardArray[0].length - 1 && flags[anchorRow][anchorCol+1] != true && answer != true) {
        	//Check East
    		if(boardArray[anchorRow][anchorCol+1] == desiredChar) {
				isAnchorValid(anchorRow, anchorCol+1, input.substring(1));
        	}
    	}
    	
    	if(anchorCol != 0 && flags[anchorRow][anchorCol-1] != true && answer != true) {
        	//Check West
    		if(boardArray[anchorRow][anchorCol-1] == desiredChar) {
				isAnchorValid(anchorRow, anchorCol-1, input.substring(1));
        	}
    	}	
    	
		flags[anchorRow][anchorCol] = false; //remove corresponding flag
		
    	return;
    }
    
	public static void main(String[] args) {
		char[][] input = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
		
		System.out.println(exist(input, "ABCB"));
	}

}
