package Medium_Difficulty;

public class Bitwise_AND_of_Numbers_Range {
    public static int rangeBitwiseAnd(int left, int right) {
        if(left == right) {
        	return left;
        }
        
    	int x = (int)(Math.log10(right*1.0)/Math.log10(2.0));
    	int lampost = (int)Math.pow(2,x);
    	System.out.println(lampost);
    	if(left < lampost) {
    		return 0;
    	}else if(left == lampost) {
    		return lampost;
    	}else {
    		long previous = left;
        	long current = left + 1;
            
        	while(current<=right) {
        		previous = (current & previous);
            	current++;
            }

        	return (int)previous;
    	}
    }
    
	public static void main(String[] args) {
		int left = 2147483646;
		int right = 2147483647;

		System.out.println(rangeBitwiseAnd(left,right));
	}

}
