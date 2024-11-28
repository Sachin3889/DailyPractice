package continueDailyPractice;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		sc.close();
		BigInteger factorialOfGivenNo = factorial(BigInteger.valueOf(enteredNumber));
		System.out.println(factorialOfGivenNo);
	}
	
	public static BigInteger factorial(BigInteger number) {
		if(number == BigInteger.ZERO) {
			return BigInteger.ONE;
		}
		else {
			return number.multiply(factorial(number.subtract(BigInteger.ONE)));
		}
	}

}
