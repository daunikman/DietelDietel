/* Psuedocode
	1. Prompt User for first integer
	2. Collect and save first integer
	3. Prompt user for second integer
	4. Collect and save second integer
	5. Check for the Larger integer
	6. Print the larger integer
	7. check if both integers are equal
	8. Print "These numbers are equal.

 */

import java.util.Scanner;

public class TwoPointOneSix{

	public static void main(String[] args){
	
	Scanner collector = new Scanner(System.in);
	
	System.out.println("Enter the first integer: ");
	int firstInteger = collector.nextInt();

	System.out.println("Enter the second Integer: ");
	int secondInteger = collector.nextInt();

	if (firstInteger == secondInteger) { 
		System.out.println("These numbers are equal");
		}
	if (firstInteger > secondInteger) {
		System.out.printf("The Larger number is %d%n", firstInteger);
		}
	if (secondInteger > firstInteger) {
		System.out.printf("The Larger number is %d%n", secondInteger);
		}	
	}
}
