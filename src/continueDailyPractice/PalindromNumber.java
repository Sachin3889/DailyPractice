package continueDailyPractice;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int givenNumber = sc.nextInt();
		sc.close();
		
		int reversedNumber = 0;
		int copyOfGivenNumber = givenNumber;
		
		while(copyOfGivenNumber > 0) {
			int digit = copyOfGivenNumber % 10;
			reversedNumber = reversedNumber * 10 + digit;
			copyOfGivenNumber = copyOfGivenNumber/10;
		}
		
		if(reversedNumber == givenNumber) {
			System.out.println("The given number "+ givenNumber + " is a palindrome number.");
		} else {
			System.out.println("The given number " + givenNumber + " is not a palindrome number.");
		}

	}

}
