package Basics;
import java.util.Scanner;

public class Von_Neuman_Loves_Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int input = 1;
		while(input<=N) {
			int num = sc.nextInt();
			int decimal = 0;
			int count = 0;
			while(num>0) {
				int ud = num%10;
				decimal = decimal + (int)(ud*Math.pow(2, count))  ;
				num = num/10;
				count++;
			}
			System.out.println(decimal);
			input++;

		}

	}

}
