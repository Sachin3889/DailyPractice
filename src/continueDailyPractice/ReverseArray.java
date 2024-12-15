package continueDailyPractice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		
		int size = sc.nextInt();
		int[] array = new int[size];
		
		System.out.println("Enter " + size + " numbers.");
		for(int i = 0; i < size; i++) {
			array[i] = sc.nextInt();
		}
		
		System.out.println("The given array is : " + Arrays.toString(array));
		
//		int[] reverseArray = new int[size];
//		for(int i = size ; i > 0 ; i--) {
//			reverseArray[i - 1] = array[size-i];
//		}
//		
//		System.out.println("The reversed array is : " + Arrays.toString(reverseArray));
		
		//Best Approach (Two pointer approach)
		
		rverseArray(array);
		System.out.println("The reversed array is : " + Arrays.toString(array));
		
		
	}
	
	public static void rverseArray(int[] array) {
		int left = 0, right = array.length-1;
		while(left < right) {
			int temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			left++;
			right--;
		}
	}

}
