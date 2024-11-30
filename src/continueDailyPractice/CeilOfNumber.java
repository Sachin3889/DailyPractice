package continueDailyPractice;

import java.util.Scanner;

public class CeilOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter a number whose ceil value you want : ");
		Scanner input = new Scanner(System.in);
		double noToBeFormatted = input.nextDouble();
		input.close();
		
		long ceilNumber = 0;
		
//		System.out.println(Math.ceil(noToBeFormatted));
		
		if(noToBeFormatted - (int)noToBeFormatted > 0) {
			ceilNumber = (int)(noToBeFormatted + 1);
		} else {
			ceilNumber = (int)noToBeFormatted ;
		}
		
		System.out.print("The ceil of the given entered number is : " + ceilNumber + ".");

	}

}
