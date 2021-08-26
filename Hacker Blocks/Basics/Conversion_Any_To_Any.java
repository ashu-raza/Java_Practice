package Basics;
import java.util.Scanner;

public class Conversion_Any_To_Any {
	
	public static int convert (int num, int source, int destn) {
		int count = 0;
		int newNum = 0;
		
		while(num>0) {
			int rem = num%destn; 
			num = num/destn; //divide by destination base
			rem = (int)(rem*Math.pow(source, count)); //multiply by source base
			count++;
			newNum = newNum + rem; 
		}
		
		return newNum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sb = sc.nextInt();
		int db = sc.nextInt();
		int sn = sc.nextInt();
		
		//Conversion from Source Base to Base 10
		int temp = convert(sn, sb, 10); 
		//Conversion from Base 10 to Destination Base
		int dn = convert(temp, 10, db); 
		
		System.out.println(dn);
	}

}
