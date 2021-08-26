package Basics;
import java.util.Scanner;

public class Rain_Water_Trapping {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		while(T>0){
			int N = sc.nextInt();
			int[] heightOfTower = new int[N];
					
			for(int i = 0; i<N; i++ ) {
				heightOfTower[i] = sc.nextInt();
			}
			
			int answer = 0;

			int towerIndex = 0;			
			while(towerIndex<N) {
				//finding tallest tower on the left of towerIndex
				int tallestLeft = 0;
				for(int i = 0; i<towerIndex; i++) {
					if(heightOfTower[i]>tallestLeft) {
						tallestLeft = heightOfTower[i];
					}
				}
				
				//finding tallest tower on the right of towerIndex
				int tallestRight = 0;
				for(int i = towerIndex+1; i<N; i++) {
					if(heightOfTower[i]>tallestRight) {
						tallestRight = heightOfTower[i];
					}
				}
				
				int waterStoredOnTower = Math.min(tallestLeft, tallestRight) - heightOfTower[towerIndex];
				
				if(waterStoredOnTower>0) {
					answer = answer + waterStoredOnTower; 
				}
				towerIndex++;
			}
			
			System.out.println(answer);
			T--;
		}

	}

}
