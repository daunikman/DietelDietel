/*
Psuedocode for BMI calculator
	1.	Prompt user for Weight in Kilogramms
	2. Collect and save weight
	3. Prompt user for height in Meters
	4. Calculate user BMI and save the value as BMI
	5. Display BMI and Health information
*/

import java.util.Scanner;

public class TwoPointThreeThree{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		System.out.print("Enter weight in Kilograms: ");
		int weight = collector.nextInt();
		
		System.out.print("Enter Height in Meters: ");
		int height = collector.nextInt();
		
		int bmi = (weight/(height * height));
		
		System.out.printf(" Your BMI is %d%n", bmi);
		if(bmi < 18.5){
		System.out.println(" You are Underweight \n\n");
		}
		
		if(bmi >= 18.5 && bmi <25){
		System.out.println(" Congratualations, You are normal \n\n");
		}
		
		if(bmi >= 25 && bmi <30){
		System.out.println("Careful, you are Over weight \n\n");
		}
		if(bmi >= 30){
		System.out.println("It is official Pal! You are Obessed \n\n");
		}
		
		System.out.println("BMI VALUES");
		System.out.println("Underweight:	less than 18.5");
		System.out.println("Normal:		between 18.5 and 24.9");
		System.out.println("Overweight:	between 25 and 29.9");
		System.out.println("Obese:		30 or greater");

	}
}