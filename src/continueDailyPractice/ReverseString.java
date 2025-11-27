package continueDailyPractice;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		
		String reverseString = s.chars().distinct().mapToObj(ch -> String.valueOf((char) ch)).sorted(Comparator.reverseOrder()).collect(Collectors.joining());
		System.out.println(reverseString);

	}

}
