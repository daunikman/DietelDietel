      /*
Pseudocode
	1. Prompt user for first integer
	2. collect and save first integer
	3. Prompt user for second integer
	4. Collect and save second integer
	3. check for the modulo  by dividing the first number by second
	4. If the modulo is 1, then  display "The first number is not a multiple of the second" 
	5. If the modulo is 0, then display "The firstnumber is a multiple of the second"
*/
import java.util.Scanner;

public class TwoPointTwoSix{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter First Integer: " );
		int firstNumber  = collector.nextInt();
		
		System.out.print("Enter Second Integer: ");
		int secondNumber = collector.nextInt();

		if (firstNumber % secondNumber != 0){
			System.out.printf("%d is not a multiple of %d%n", firstNumber, secondNumber );
		}
		if (firstNumber % secondNumber == 0) {
			System.out.printf("%d is a multiple of %d%n", firstNumber, secondNumber);
		}		

	}


}


