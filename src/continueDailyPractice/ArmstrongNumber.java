package continueDailyPractice;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int enteredNumber = sc.nextInt();
		int enteredNumberCopy = enteredNumber;
		sc.close();
		double sumOfCubesOfEachDigitOfNo = 0;
		while(enteredNumber > 0) {
			sumOfCubesOfEachDigitOfNo = sumOfCubesOfEachDigitOfNo + Math.pow(enteredNumber%10 , 3);
			enteredNumber = enteredNumber/10;
		}
		System.out.println(sumOfCubesOfEachDigitOfNo);
		if(enteredNumberCopy == (int)sumOfCubesOfEachDigitOfNo) {
			System.out.println("Entered Number is an armstrong number");
		} else {
			System.out.println("Entered Number is not an armstrong number");
		}

	}

}
