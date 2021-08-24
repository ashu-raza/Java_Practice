package Recursion;

import java.util.Scanner;

public class Class_Assignment {
	public static int lookBehind(int curr, int N, int ending_a, int ending_b) {
		//Base Case
		if(curr == N) {
			return ending_a + ending_b;
		}
		
		//My Work
		int temp = ending_a;
		ending_a = ending_a + ending_b;
		ending_b = temp;
		
		//Recursive Call
		return lookBehind(curr + 1, N, ending_a, ending_b);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int i = 1;
		while(T>0) {
			int N = sc.nextInt();
			
			System.out.println("#" + i + " : " + lookBehind(1, N, 1, 1));
			i++;
			T--;
		}

	}

}
