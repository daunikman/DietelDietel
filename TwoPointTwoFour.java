/*
Psuedocode
	1. Prompt user for first integer
	2. Collect and save first integer
	3. Prompt user for second Integer
	4. Collect and save second integer
	5. Prompt user for third integer
	6. Collect and save third integer
	7. Prompt user for Fourth integer
	8 Collect and save Fourth integer
	9. Prompt user for Fifth Integer
	10. Collect and save Fifth integer
	11. check for the smallest number
	12. check for the largest number 
	13. Show users smallest and largest number.
*/

import java.util.Scanner;

public class TwoPointTwoFour{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.println("Enter first integer");
		int firstNumber = collector.nextInt();

		System.out.println("Enter Second Integer");
		int secondNumber = collector.nextInt();

		System.out.println("Enter Third Integer");
		int thirdNumber = collector.nextInt();

		System.out.println("Enter Fourth integer");
		int fourthNumber = collector.nextInt();

		System.out.println("Enter fifth Integer");
		int fifthNumber = collector.nextInt();

	
		if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber ){
			System.out.printf("The largest number is %d%n" , firstNumber);
			}

		if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber&& secondNumber > fifthNumber){
			System.out.printf("The Largest number is %d%n" , secondNumber);
			}

		if (thirdNumber >  firstNumber && thirdNumber > secondNumber && thirdNumber> fourthNumber && thirdNumber > fifthNumber){
			System.out.printf("The largest number is %d%n", thirdNumber);
			}

		if (fourthNumber >  firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber){
			System.out.printf("The largest number is %d%n", fourthNumber);
			}
		
		if (fifthNumber >  firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber){
			System.out.printf("The largest number is %d%n", fifthNumber);
			}

		
		if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber ){
			System.out.printf("The Smallest number is %d%n" , firstNumber);
			}

		if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
			System.out.printf("The Smallest number is %d%n" , secondNumber);
			}

		if (thirdNumber <  firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber&& thirdNumber < fifthNumber){
			System.out.printf("The Smallest number is %d%n", thirdNumber);
			}

		if (fourthNumber <  firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
			System.out.printf("The Smallest number is %d%n", fourthNumber);
			}
		
		if (fifthNumber <  firstNumber && fifthNumber < secondNumber && fifthNumber < thirdNumber && fifthNumber < fourthNumber){
			System.out.printf("The Smallest number is %d%n", fifthNumber);
			}		

		}
}
