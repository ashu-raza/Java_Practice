package Recursion;
import java.util.ArrayList;
import java.util.Scanner;

public class All_Indices_Problem {
	public static ArrayList<Integer> findIndices(int[] array, int M, int pointer, ArrayList<Integer> indexList) {
		//Base Case
		if(pointer == array.length) {
			return indexList;
		}
		
		//My Work
		if(array[pointer] == M) {
			indexList.add(pointer);
		}
		
		//Recursive Call
		return (findIndices(array, M, pointer+1, indexList));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		
		ArrayList<Integer> indexList = new ArrayList<>(N);
		
		indexList = findIndices(array, M, 0, indexList);

		for(int i = 0; i<indexList.size(); i++) {
			System.out.print(indexList.get(i) +" ");
		}
		
		return;
	}

}
