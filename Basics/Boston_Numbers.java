package Basics;
import java.util.Scanner;

public class Boston_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long num = sc.nextLong();
		
		long sumOfDigitsOfNumber = findSumOfDigits(num);
		
		long sumOfDigitsOfItsPrimeFactors = primeFactorize(num);
		
		if(sumOfDigitsOfNumber == sumOfDigitsOfItsPrimeFactors) {
			System.out.println(1); //given number is a Boston number
		}else {
			System.out.println(0); //given number is not a Boston number
		}
		
	}
	
	public static long findSumOfDigits(long n) {
		long sumOfDigits = 0;
		
		while(n>0) {
			long unitDigit = n%10;
			sumOfDigits = sumOfDigits+ unitDigit;
			n = n/10;
		}
		
		return sumOfDigits;
	}
	
	public static long primeFactorize(long n) {
		long sumOfDigitsOfPrimeFactors = 0;
		
		while(n>1) {
			long divisor = 2; //beginning from the smallest prime number 
			
			while(true) {
				if(n%divisor == 0) {
					sumOfDigitsOfPrimeFactors = sumOfDigitsOfPrimeFactors + findSumOfDigits(divisor);
					break;
				}else {
					divisor = nextPrimeNumber(divisor); //replacing divisor by the next prime number
				}
			}
			n = n/divisor; //this statement is executed only when divisor is a prime factor of n
		}
		
		return sumOfDigitsOfPrimeFactors;
	}
	
	public static long nextPrimeNumber(long n) {
		long newN;
		
		if(n==2) {
			newN = n + 1;
		}else {
			newN = n + 2;
		}
		
		while(true) {
			if(isPrime(newN)) {
				break;
			}else {
				newN+=2;
			}
		}
		
		return newN;
	}
	
	public static boolean isPrime(long n) {
		boolean flag = true;

		int div = 2;
		while(div <= Math.sqrt(n)) {
			if(n%div == 0) {
				flag = false;
				break;
			}else {
				div++;
			}	
		}
		
		return flag;
	}

}
