package continueDailyPractice;

import java.util.Scanner;

public class SwapTwoNoWithoutUsingThirdVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a = " + a + " b = "+ b);
	}

}
