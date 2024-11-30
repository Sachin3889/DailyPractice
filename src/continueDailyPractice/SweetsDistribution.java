package continueDailyPractice;

import java.util.Scanner;

public class SweetsDistribution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Distribute entered sweets to the given guests according to below rules : 
		    1. Sweets are served until it gets over.
		    2. Sweets each guest receives in first round is equal to their position in the queue.
		    3. If sweets are still left, then in next round number of sweets they get will be equal to their position + 1 and so on.
		    4. If number of sweets is less than the position of guest in queue, then the guest receives only remaining number of sweets.  */
		
		System.out.println("Enter Number of sweets and guests to whom it will be distributed separated by comma only");
		Scanner sc = new Scanner(System.in);
		String number = sc.nextLine();
		sc.close();
		
		int numberOfSweets = Integer.parseInt(number.split(",")[0]);
		int numberOfGuests = Integer.parseInt(number.split(",")[1]);
		System.out.println("Number of sweets are " + numberOfSweets + " and number of guests are " + numberOfGuests + "." );
		
		int sweetsArray[] = distributeSweets(numberOfSweets, numberOfGuests);
		
		for(int i =0; i < sweetsArray.length; i++) {
			System.out.println(sweetsArray[i] + " ");
		}

	}
	
	public static int[] distributeSweets(int sweets, int guest){
		int[] sweetsGivenArray = new int[guest];
		int count = 0;
		while(sweets > 0) {
			for(int i = 1; i <= guest; i++) {
				int sweetsToGive = i + count;
				if(sweets >= sweetsToGive) {
					sweetsGivenArray[i-1] = sweetsGivenArray[i-1] + sweetsToGive;
					sweets -= sweetsToGive ;
				} else {
					sweetsGivenArray[i-1] = sweetsGivenArray[i-1] + sweets;
					sweets = 0;
					break;
				}
			}
			count++;
		}
		return sweetsGivenArray;
	}

}
