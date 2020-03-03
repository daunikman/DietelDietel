/*
World Population growth calculator
Pseudocode
	1. Create a variable for current population
	2. Display growth in one year (1.8/100*CurrentPopulation + Current Population
	3. Display growth in 2 Years, 3 , 4 and 5 (one year * 2, 3, 4, 5);
	*/

public class TwoPointThreeFour{
	public static void main(String[] args){
		long currentPopulation = 7727680123l;
	//	long populationInAYear = (currentPopulation * (2/100)) + currentPopulation;
		
		System.out.printf("The Current Population is %d%n", currentPopulation);
		System.out.printf("The Estimated Population after One year is	 %d%n",((currentPopulation * (2/100) * 1) + currentPopulation));
		System.out.printf("The Estimated Population after Two years is	 %d%n",((currentPopulation * (2/100) * 2) + currentPopulation ));
		System.out.printf("The Estimated Population after Three years is 	%d%n",((currentPopulation * (2/100) * 3) + currentPopulation));
		System.out.printf("The Estimated Population after Four years is	 %d%n", ((currentPopulation * (2/100) * 4) + currentPopulation));
		System.out.printf("The Estimated Population after Five years is	 %d%n",((currentPopulation * (2/100) * 5) + currentPopulation));
		
	
	}

}