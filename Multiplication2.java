import java.util.Scanner;

public class Multiplication2{
	public static void main(String[] args){
		multiply();
	}
	public static void multiply(){
		System.out.println("Hey! Enter the Value for first number: ");
	
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();

		System.out.println("Hey! Enter the value for the second number: ");
		int number2 = input.nextInt();

		int result = number1 * number2;
		System.out.printf("Result is %d%n", result);

	}

}
