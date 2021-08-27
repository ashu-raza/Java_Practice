package Recursion;

import java.util.Scanner;
import java.util.ArrayList;

public class Subset_Problem_Recursion {
	public static int genSubset(int[] input, int target, int pointer, ArrayList<Integer> subset) {
		if(pointer == input.length) {
			int sum = 0;
			for(int i = 0; i<subset.size(); i++) {
				sum += subset.get(i);
			}
			
			if(sum == target) {
				for(int i = 0; i<subset.size(); i++) {
					System.out.print(subset.get(i) + " ");
				}
				System.out.print(" ");
				return 1;
			}else {
				return 0;
			}
		}
				
		ArrayList<Integer> nowSubset = new ArrayList<>();
		for(int i = 0; i<subset.size(); i++) {
			nowSubset.add(subset.get(i));
		}
		nowSubset.add(input[pointer]);
		
		int b = genSubset(input, target, pointer+1, nowSubset); //Accept
		int a = genSubset(input, target, pointer+1, subset); //Reject

		return a+b;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int[] array = new int[N];
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		int T = sc.nextInt();
		
		int ans = genSubset(array, T, 0, new ArrayList<>());
		System.out.println();
		System.out.println(ans);
	}

}
