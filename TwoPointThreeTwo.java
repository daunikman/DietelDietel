/*
psuedocode
	1. Prompt user for number
	2. Collect and save number
	1. Prompt user for number
	2. Collect and save number
	1. Prompt user for number
	2. Collect and save number
	1. Prompt user for number
	2. Collect and save number
	1. Prompt user for number
	2. Collect and save number
	1. Prompt user for number
	2. Collect and save number
		create counter for zero, positive, negative
		
	check if zero, increment counter
	check if positive, increment counter
	check if negative, increment counter.

		
	
*/

import java.util.Scanner;

public class TwoPointThreeTwo{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter value for first number: " );
		int firstNumber = collector.nextInt();
		
		System.out.print("Enter value for Second number: " );
		int secondNumber = collector.nextInt();
		
		System.out.print("Enter value for third number: " );
		int thirdNumber = collector.nextInt();
		
		System.out.print("Enter value for fourth number: " );
		int fourthNumber = collector.nextInt();
		
		System.out.print("Enter value for fifth number: " );
		int fifthNumber = collector.nextInt();
		
		int zeroCounter = 0, positiveCounter= 0, negativeCounter =0;
		
		if(firstNumber == 0){
			zeroCounter++;
		}
	
		if(secondNumber == 0){
			zeroCounter++;
		}
		if(thirdNumber == 0){
			zeroCounter++;
		}
		if(fourthNumber == 0){
			zeroCounter++;
		}
		if(fifthNumber == 0){
			zeroCounter++;
		}
	
		
			if(firstNumber > 0){
			positiveCounter++;
		}
	
		if(secondNumber > 0){
			positiveCounter++;
		}
		if(thirdNumber > 0){
			positiveCounter++;
		}
		if(fourthNumber > 0){
			positiveCounter++;
		}
		if(fifthNumber > 0){
			positiveCounter++;
		}
	
	
		
			if(firstNumber < 0){
			negativeCounter++;
		}
	
		if(secondNumber < 0){
			negativeCounter++;
		}
		if(thirdNumber < 0){
			negativeCounter++;
		}
		if(fourthNumber < 0){
			negativeCounter++;
		}
		if(fifthNumber < 0){
			negativeCounter++;
		}
	
		System.out.printf("There are %d Positive Numbers, %d Negative Numbers, %d Zero Numbers%n", positiveCounter, negativeCounter, zeroCounter);
	}
	



}
