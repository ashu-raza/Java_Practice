package Basics;
import java.util.Scanner;

public class Find_Largest_of_3_Numbers {
	public static int comparator(int first, int second) {
		if(first>=second) {
			return first;
		}else {
			return second;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println(comparator(c,comparator(a,b)));
	}

}
