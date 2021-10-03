package Easy_Difficulty;

import java.util.Scanner;

public class Two_Sum_1 {
	public static int[] twoSum(int[] array, int target) {
		int first = 0;
		int second = 0;
		
		for(int i = 0; i<array.length; i++) {
			for(int j = 0; j<array.length && j!=i; j++) {
				if(array[i] + array[j] == target) {
					first = i;
					second = j;
				}
			}
		}
		
		int[] ans = {first, second};
		return ans;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int target = sc.nextInt();
		int N = sc.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0; i<N; i++) {
			array[i] = sc.nextInt();
		}
		
		for(int ele: twoSum(array, target)) {
			System.out.println(ele);
		}
	}
}
