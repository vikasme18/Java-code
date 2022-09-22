package lab3;

public class PopulationCalculator {
	private static int inital_population = 175000; // initially the population of the town before increase.
	private static int final_population = 262500; // total population in a decade.

	public static void main(String[] args) {
		int increased_population = final_population - inital_population; // total increased population in a decade
		// At first we are calculation the average increased population in a decade.
		// After that we are dividing with the 10 to calculate the average population for each year.
		
		int avg_growth = (increased_population * 100) / inital_population; // Average Population increased in a decade(10 years). 
		
		// Now we are dividing it with 10 to calculate average increase for each year.
		double total = avg_growth/10;
		
		System.out.println("Inital Population of the town: " + inital_population);
		System.out.println("Final Population of the town: " + final_population);
		System.out.println("Total increased population in 10 years: " + increased_population);
		System.out.println("Average growth in 10 years in percentage " + avg_growth);
		System.out.println("The average percent increase of population per year " + total);
	}

}
