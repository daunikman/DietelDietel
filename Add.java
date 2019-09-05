import java.util.Scanner;
//import System.out;

public class Add{

	public static void main(String[] args){
	Scanner collector = new Scanner(System.in);
	int number1;
	int number2;
	int sum;
	System.out.println(" Enter Values" );
	number1 = collector.nextInt();
	System.out.println("Enter Value 2");
	number2 = collector.nextInt();
	sum = number1 + number2;
	System.out.printf("%s%d" , "The Sum is" , sum);


	}



}
