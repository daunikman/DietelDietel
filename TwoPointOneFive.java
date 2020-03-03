/* Psuedocode
	1. Prompt user for first integer
	2. Collect and save the First integer
	3. Prompt user for second integer
	4. Collect and save the second integer
	5. Calculate Sum and save the Sum as sum
	6. Calculate product and save as product
	7. Calculate difference and save as difference
	8. Calculate quotient and save as quotient.
	9. print the values of sum, product, difference and quotient to user.

*/

import java.util.Scanner;

public class TwoPointOneFive {
	public static void main(String[] args){
	
	System.out.println("Enter first integer ");
	Scanner collector = new Scanner(System.in);
	int firstInteger = collector.nextInt();
	
	System.out.println("Enter Second integer ");
	int secondInteger = collector.nextInt();
	
	int sum = firstInteger + secondInteger;
	int product = firstInteger * secondInteger;
	int quotient = firstInteger / secondInteger;
	int difference = firstInteger - secondInteger;

	System.out.printf( "The Sum of %d and %d  =  %d , The Product is %d , Quotient is %d, Difference is %d%n", firstInteger, secondInteger, sum, product, quotient, difference); 

	}

}
