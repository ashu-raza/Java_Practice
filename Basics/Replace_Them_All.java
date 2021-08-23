package Basics;
import java.util.Scanner;

public class Replace_Them_All {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		long newNum = 0;
		int count = 0;
		if(num==0) {
			newNum = 5;
		}else {
			while(num>0) {
				long ud = num%((long)10);
				
				if(ud == 0) {
					ud = (long)5;				
				}
				
				newNum = newNum + (long)(ud * Math.pow(10, count));
				num /= 10;
				count++;
			}
		}
		
		
		System.out.println(newNum);
	}

}