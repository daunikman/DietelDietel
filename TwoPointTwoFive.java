            /*
Pseudocode
	1. Prompt user for an integer
	2. collect and save integer
	3. check for the modulo of the integer after dividing by 2
	4. If the modulo is 1, then  display "This is an odd number" 
	5. If the modulo is 0, then display "This is an even number"
*/
import java.util.Scanner;

public class TwoPointTwoFive{
	public static void main(String[] args){
		Scanner collector = new Scanner(System.in);
		
		System.out.print("Enter Integers: " );
		int number  = collector.nextInt();
		if (number % 2 == 1){
			System.out.println("This is an Odd Number" );
		}
		if (number % 2 == 0) {
			System.out.println("This is an even number");
		}		

	}


}
