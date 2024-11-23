package continueDailyPractice;

import java.util.Scanner;

public class NoOfDigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int originalNumber = number;
		int count = 0;
		
		while(number > 0) {
			number = number/10;
			count++;
		}
		
		System.out.println("Number of digits in " + originalNumber + " is " + count + ".");

	}

}
