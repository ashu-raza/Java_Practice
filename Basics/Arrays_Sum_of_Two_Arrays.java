package Basics;
import java.util.Scanner;

public class Arrays_Sum_of_Two_Arrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array1 = new int[N];
		int num1 = 0;
		for(int i = 0; i<N; i++) {
			array1[i] = sc.nextInt();
			num1 = num1 + (int)(array1[i]*Math.pow(10,(N-1)-i)); 
		}
		
		int M = sc.nextInt();
		int[] array2 = new int[M];
		int num2 = 0;
		for(int i = 0; i<M; i++) {
			array2[i] = sc.nextInt();
			num2 = num2 + (int)(array2[i]*Math.pow(10,(M-1)-i)); 
		}

		int sum = num1 + num2;
		
		int x = Math.max(M,N); 
		int[] ans;
		ans = new int[x+1];
		ans[0] = 0;
		
		int i=1;
		while(sum>0) {
			int uD = sum%10;
			ans[x+1 - i] = uD;
			sum /= 10;
			i++;
		}
		
		int j;
		if(ans[0]==0) {
			j=1;
		}else {
			j=0;
		}
		
		while(j<ans.length) {
			System.out.print(ans[j] + ", ");
			j++;
		}
		System.out.print("END");
	}

}
