/*
Psuedocode
	1. Prompt user for 5 digit input
	2. Collect and safe the number
	2. Separate the last digit  by modulo 10
	3. Separate the 4th digit  by  modulo 100 and dividing by 10
	4. Separate the 3rd digit by  modulo 1000 and dividing by 100
	5. Separate the 2nd digit by modulo 10000 and dividing by 1000
	6. Separate the 1st digit by diving by 10000.


*/

import java.util.Scanner;

public class TwoPointThreeZero{
	public static void main(String[] args){
		System.out.print("Enter a 5 Digit Number: ");
		Scanner collector = new Scanner(System.in);
		int fiveDigitNumber = collector.nextInt();
		
		int firstDigit = fiveDigitNumber / 10000 ;
		int secondDigit = fiveDigitNumber %10000 / 1000;
		int thirdDigit =  fiveDigitNumber % 1000 / 100;
		int fourthDigit = fiveDigitNumber % 100 / 10;
		int fifthDigit =  fiveDigitNumber %10;
		
		System.out.printf("The numbers are %d   %d   %d   %d   %d%n", firstDigit, secondDigit, thirdDigit, fourthDigit, fifthDigit);
		
	
	
	}




}
