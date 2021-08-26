package Basics;
import java.util.Scanner;

public class Shopping_Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		int testcase = 1;
		while(testcase <=T) {
			int maxA = sc.nextInt(); //Aayush
			int maxH = sc.nextInt(); //Harshit
			
			int countA = 0;
			int countH = 0;
			
			for(int n = 1; true; n++) {
				countA = countA + (2*n -1); //playing this round, prospectively
				
				if(countA > maxA) { 
					System.out.println("Harshit"); //Aayush looses
					break;
				}
				
				countH = countH + (2*n); //playing this round, prospectively
				if(countH > maxH) {
					System.out.println("Aayush"); //Harshit looses
					break;
				}
			}
			
			testcase++;
		}

	}

}
