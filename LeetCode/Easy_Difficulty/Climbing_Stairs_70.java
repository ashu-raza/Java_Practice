package Easy_Difficulty;

public class Climbing_Stairs_70 {

		// There are only two possible ways of reaching any particular step, these are: either take a single jump from the penultimate step or 
		// take a double jump from the anti-penultimate step. 
		// Now the total number of ways (counted from the very bottom) of reaching the current step is the sum of the possible ways of reaching 
		// the penultimate step and the possible ways of reaching the anti-penultimate step.
			    
		public int climbStairs(int n) {
			int waysOfReachingCurrentStep=0;
			        
			int waysOfReachingPrevToPreviousStep = 0; //Anti-penultimate step (First Default Fibonacci Number)
			int waysOfReachingJustPreviousStep = 1; //Penultimate step (Second Default Fibonacci Number)
			        
			for(int i=1; i<=n;i++){
				waysOfReachingCurrentStep = waysOfReachingJustPreviousStep + waysOfReachingPrevToPreviousStep; 
			            
			    //Preparation for next iteration
			    waysOfReachingPrevToPreviousStep = waysOfReachingJustPreviousStep;
			    waysOfReachingJustPreviousStep = waysOfReachingCurrentStep;   
			}
			        
			return waysOfReachingCurrentStep;  
		}

}
