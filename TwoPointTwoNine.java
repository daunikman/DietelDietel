import java.util.Scanner;

public class TwoPointTwoNine{
	public static void main(String[] args){
		System.out.print("Enter a Character: ");
		Scanner collector = new Scanner(System.in);
	//	char character = collector.next();
		char character = collector.next().trim().charAt(0);
	
		System.out.printf("The Character %c has the value of %d%n", character, ((int)character));


	}


}
