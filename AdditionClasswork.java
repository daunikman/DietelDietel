import java.util.Scanner;

public class AdditionClasswork{
	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);
	System.out.print("Enter Value for the first number?\n");
	int number1 = collector.nextInt();
	System.out.print("Enter Value for the second number?\n");
	int number2 = collector.nextInt();
	System.out.printf("The sum of the number is %d%n", number1+number2);

	}

}
