import java.util.Scanner;
 
public class Comparison{
	public static void main(String[] args){
		System.out.print("Enter the first number: ");
		Scanner collector = new Scanner(System.in);
		int firstNumber = collector.nextInt();
		
		System.out.print("Enter the Second Number: ");
		int secondNumber = collector.nextInt();

		if(firstNumber == secondNumber){
			System.out.print("They are equal");
		}

		if(firstNumber != secondNumber){
			System.out.print("Your numbers are not equal" );
		}

	}

}
