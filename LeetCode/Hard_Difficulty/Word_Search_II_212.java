package Hard_Difficulty;

import java.util.ArrayList;

public class Word_Search_II_212 {
    static boolean[][] flagsOnBoardElements;
    static boolean[] flagsOnWords;
    static boolean currWordFoundFlag;
    
	static char[][] inputBoard;
	static String[] listOfWords;
    
	public static ArrayList<String> findWords(char[][] board, String[] words) {
		flagsOnBoardElements = new boolean[board.length][board[0].length];
		flagsOnWords = new boolean[words.length];
		
    	inputBoard = board;
		listOfWords = words;
				
    	ArrayList<String> finalAnswerList = new ArrayList<>(); 
    	
    	//Traversing the board in search of the first character
    	for(int row = 0; row<board.length; row++) {
    		for(int col = 0; col<board[row].length; col++) {
    			ArrayList<Integer> indices = searchForGivenCharAtZeroethIndex(board[row][col]);
    			
    			if(indices.size() != 0) {
    				for(int k = 0; k<indices.size(); k++) {
    					String currWord = words[indices.get(k)];
        				
        				isAnchorValid(row, col, currWord.substring(1));

        				if(currWordFoundFlag == true) {
        					finalAnswerList.add(currWord);
        					flagsOnWords[indices.get(k)] = true;
        				}
        				
        				currWordFoundFlag = false;
    				}
    			}
    		}
    	}
    	
    	return finalAnswerList;
    }
	
	public static ArrayList<Integer> searchForGivenCharAtZeroethIndex(char givenChar) {
		ArrayList<Integer> indices = new ArrayList<>(1);
		
		for(int index = 0; index<listOfWords.length; index++) {
			if(listOfWords[index].charAt(0) == givenChar && flagsOnWords[index] == false) {
				indices.add(index);
			}
		}
		
		return indices;
	}
	
	public static void isAnchorValid(int anchorRow, int anchorCol, String input) {			
		if(input.length() == 0) {
			currWordFoundFlag = true;
			return;
		}

		flagsOnBoardElements[anchorRow][anchorCol] = true; //set corresponding flag

    	char desiredChar = input.charAt(0);
    		
    	if(anchorRow != 0 && flagsOnBoardElements[anchorRow-1][anchorCol] == false && currWordFoundFlag == false) {
        	//Check North
    		if(inputBoard[anchorRow-1][anchorCol] == desiredChar) {
				isAnchorValid(anchorRow-1, anchorCol, input.substring(1));
        	}
    	}
    		
    	if(anchorRow != inputBoard.length - 1 && flagsOnBoardElements[anchorRow+1][anchorCol] == false && currWordFoundFlag == false) {
        	//Check South
        	if(inputBoard[anchorRow+1][anchorCol] == desiredChar) {
				isAnchorValid(anchorRow+1, anchorCol, input.substring(1));
        	}
    	}
    		
    	if(anchorCol != inputBoard[0].length - 1 && flagsOnBoardElements[anchorRow][anchorCol+1] == false && currWordFoundFlag == false) {
        	//Check East
    		if(inputBoard[anchorRow][anchorCol+1] == desiredChar) {
				isAnchorValid(anchorRow, anchorCol+1, input.substring(1));
        	}
    	}
    	
    	if(anchorCol != 0 && flagsOnBoardElements[anchorRow][anchorCol-1] == false && currWordFoundFlag == false) {
        	//Check West
    		if(inputBoard[anchorRow][anchorCol-1] == desiredChar) {
				isAnchorValid(anchorRow, anchorCol-1, input.substring(1));
        	}
    	}	
    	
		flagsOnBoardElements[anchorRow][anchorCol] = false; //remove corresponding flag
		
    	return;
    }

	public static void main(String[] args) {
		char[][] board = {{'o','a','a','n'},{'e','t','a','e'},{'i','h','k','r'}};
		String[] words = {"oath", "pea", "eat", "rain", "oaaak", "rkat"};
		
		System.out.println(findWords(board, words));
	}
}
