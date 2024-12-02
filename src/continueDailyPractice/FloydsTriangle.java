package continueDailyPractice;

import java.util.Scanner;

public class FloydsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int noOfRows = sc.nextInt();
		sc.close();
		
		int number = 1;
		
		for(int i = 1; i <= noOfRows; i++) {
			for(int j =1; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}

}
