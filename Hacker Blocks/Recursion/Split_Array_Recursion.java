package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class Split_Array_Recursion {
	public static int split(int[] input, int pointer, ArrayList<Integer> groupA, ArrayList<Integer> groupB) {
		if(pointer >= input.length) {
			int sumA = 0;
			for(int i = 0; i<groupA.size(); i++) {
				sumA += groupA.get(i);
			}
			
			int sumB = 0;
			for(int i = 0; i<groupB.size(); i++) {
				sumB += groupB.get(i);
			}
			
			if(sumA == sumB) {
				
				for(int i = 0; i<groupA.size(); i++) {
					System.out.print(groupA.get(i) + " ");
				}
				System.out.print("and ");
				for(int i = 0; i<groupB.size(); i++) {
					System.out.print(groupB.get(i) + " ");
				}
				System.out.println();
				return 1;
			}else {
				return 0;
			}	
		}
		
		ArrayList<Integer> nowGroupA = new ArrayList<>();
		for(int i = 0; i<groupA.size(); i++) {
			nowGroupA.add(groupA.get(i));
		}
		nowGroupA.add(input[pointer]);

		ArrayList<Integer> nowGroupB = new ArrayList<>();
		for(int i = 0; i<groupB.size(); i++) {
			nowGroupB.add(groupB.get(i));
		}
		nowGroupB.add(input[pointer]);
		
		int countA = split(input, pointer + 1, nowGroupA, groupB);
		int countB = split(input, pointer + 1, groupA, nowGroupB);
		
		return countA + countB;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int ans = split(array, 0, new ArrayList<>(), new ArrayList<>());
		System.out.println(ans);
	}

}
