package continueDailyPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TriangleType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter all sides of the triangle :");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		List<String> inputData = Arrays.stream(inputString.split(",")).collect(Collectors.toList());
		sc.close();
		
		int firstSide = Integer.parseInt(inputData.get(0));
		int secondSide = Integer.parseInt(inputData.get(1));
		int thirdSide = Integer.parseInt(inputData.get(2));
		
		System.out.println("The given sides of triangle are : " + firstSide + ", " + secondSide + ", " + thirdSide);
		
		String triangleType = Utility.getTypeOfTriangle(firstSide, secondSide, thirdSide);
		
		System.out.println("The type of triangle is : " + triangleType);

	}

}

class Utility{
	public static String getTypeOfTriangle(int side1, int side2, int side3) {
		String triangleType = "NA";
		
		if(side1+side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
			if(side1 == side2 && side2 == side3) {
				triangleType = "Equilateral";
			} else if(side1 == side2 || side2 == side3 || side3==side1) {
				triangleType = "Isosceles";
			} else {
				triangleType = "Scalene";
			}
		}
		return triangleType;
	}
}
