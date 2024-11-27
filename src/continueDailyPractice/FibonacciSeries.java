package continueDailyPractice;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberEntered = sc.nextInt();
		sc.close();
		int firstNumber = 0;
		int secondNumber = 1;
		int sumOfPrevTwoNo;
		System.out.println("First "+ numberEntered +" numbers in Fibonacci series are :");
		System.out.print(firstNumber + ", ");
		System.out.print(secondNumber + ", ");
		for(int i = 0; i < numberEntered-2; i++) {
			sumOfPrevTwoNo = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = sumOfPrevTwoNo;
			if(i<numberEntered-3) {
				System.out.print(sumOfPrevTwoNo + ", ");
			} else {
				System.out.println(sumOfPrevTwoNo);
			}
		}

	}

}
