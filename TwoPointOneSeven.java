/*
Psuedocode
	1. Prompt user for first integer
	2. Collect and save first integer
	3. Prompt user for second Integer
	4. Collect and save second integer
	5. Prompt user for third integer
	6. Collect and save third integer
	7. calculate sum
	8. Save sum
	9. calculate average
	10. save average
	11. check for the smallest number
	12. check for the largest number 
	13. Show users sum, average, smallest and largest number.
*/

import java.util.Scanner;

public class TwoPointOneSeven{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int firstNumber = collector.nextInt();

		System.out.println("Enter Second Integer");
		int secondNumber = collector.nextInt();

		System.out.println("Enter Third Integer");
		int thirdNumber = collector.nextInt();

		int sum = firstNumber + secondNumber + thirdNumber;

		int average = ((firstNumber + secondNumber + thirdNumber)/ 3);

		System.out.printf("The Sum of these numbers is %d,%n  The Average is %d%n", sum, average);
	
		if (firstNumber > secondNumber && firstNumber > thirdNumber){
			System.out.printf("The largest number is %d%n" , firstNumber);
			}

		if (secondNumber > firstNumber && secondNumber > thirdNumber){
			System.out.printf("The Largest number is %d%n" , secondNumber);
			}

		if (thirdNumber >  firstNumber && thirdNumber > secondNumber){
			System.out.printf("The largest number is %d%n", thirdNumber);
			}
	
		if (firstNumber < secondNumber && firstNumber < thirdNumber){
			System.out.printf("The Smallest number is %d%n" , firstNumber);
			}

		if (secondNumber < firstNumber && secondNumber < thirdNumber){
			System.out.printf("The Smallest number is %d%n" , secondNumber);
			}

		if (thirdNumber <  firstNumber && thirdNumber < secondNumber){
			System.out.printf("The Smallest number is %d%n", thirdNumber);
			}

	}

}
