/*Psuedocode
	1.prompt user for radius
	2. collect radius and save as integer
	3. output diameter =  2 * radius
	4. display circumference as 2 * PI * radius
	5. Display area as 2 * PI * radius * radius

*/

import java.util.Scanner;

public class TwoPointTwoEight{
	public static void main(String[] args){
		System.out.print("Enter radius: ");
		Scanner collector = new Scanner(System.in);
		int radius = collector.nextInt();
		
		System.out.printf("The Diameter is %d%n", 2*radius);
		System.out.printf("The Circumference is %f%n", 2*Math.PI*radius);
		System.out.printf("The area is %f%n", Math.PI*radius*radius); 


	}



}
