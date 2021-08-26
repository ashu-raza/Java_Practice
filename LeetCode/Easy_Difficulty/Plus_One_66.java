package Easy_Difficulty;

public class Plus_One_66 {
	public static int[] recAdd(int[] input, int pointer, int carry) {
		//Base Case
		if(pointer<0) {
			if(carry == 1) {
				int[] output = new int [input.length + 1];
				
				output[0] = 1;
				for(int i = 1; i<input.length; i++) {
					output[i] = input[i];
				}
				return output;
			}else {
				return input;
			}
		}
		
		//My work
		input[pointer] = input[pointer] + carry;
		
		if(input[pointer]==10) {
			carry = 1;
			input[pointer] = 0;
		}else {
			carry = 0;
		}
		
		//Recursive Call
		int[] recAns = recAdd(input, pointer-1, carry);
		return recAns;
	}
	
	public static void main(String[] args) {
		int[] digits = {0};
		
		int[] ans = recAdd(digits, digits.length-1, 1);
				
		for(int e: ans) {
			System.out.print(e + " ");
		}
	}

}
