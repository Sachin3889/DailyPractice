package continueDailyPractice;

import java.util.Scanner;

public class BinaryAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String firstBinaryNo = sc.nextLine();
		String secondBinaryNo = sc.nextLine();
		sc.close();
		
		int lastIndexOfFirstBinaryNo = firstBinaryNo.length() - 1 ;
		int lastIndexOfSecondBinaryNo = secondBinaryNo.length() - 1;
		int carry = 0, base = 2 ;
		
		StringBuilder  sumOfBothBinaryNo = new StringBuilder();
		
		while(lastIndexOfFirstBinaryNo >= 0 || lastIndexOfSecondBinaryNo >= 0) {
			int firstBinaryNoDigit = 0, secondBinaryNoDigit = 0, sumOfdigit = 0 ;
			if(lastIndexOfFirstBinaryNo >= 0) {
				firstBinaryNoDigit = firstBinaryNo.charAt(lastIndexOfFirstBinaryNo--) - '0';
			}
			if(lastIndexOfSecondBinaryNo >= 0)
				secondBinaryNoDigit = secondBinaryNo.charAt(lastIndexOfSecondBinaryNo--) - '0';
			sumOfdigit = firstBinaryNoDigit + secondBinaryNoDigit + carry ;
			
			if(sumOfdigit >= base) {
				carry = 1 ;
				sumOfdigit = sumOfdigit - base;
			} else {
				carry = 0 ;
			}
			
			sumOfBothBinaryNo.append(sumOfdigit);
			if(carry == 1) {
				sumOfBothBinaryNo.append(carry);
			}
			sumOfBothBinaryNo.reverse().toString();
		}
		System.out.println("Sum of given binary number is \n" + sumOfBothBinaryNo);

	}

}
