
/**
 * Write a description of class Exciting here.
 * 
 * @author (Angelica)
 * @version (13 Mar 2021)
 */
public class Exciting {
	// Put your declarations for a) beneath here
	double z;
	int count = 0;
	double cost = 3.45;
	char choice = 'X';
	boolean goodChoice = true;
	short lowest = 5;

	// Put your declarations and initialisations to b) beneath here
	double temperature = 17.5;
	int jackpotNo = 9;
	int populationChina = 12354;
	boolean endGame = false;
	double distance = 8743.234;
	char grade = 'A';

	public void doit() {
		double x = 3.0;
		double y = 4.0;
		z = 2.0 * y + x / 4.0 - (x + y);
	}

	public void displayDetails() {
		System.out.print("z= ");
		System.out.println(z);

		// display the details for the variables you declared in a)
		System.out.println(count);
		System.out.println(cost);
		System.out.println(choice);
		System.out.println(goodChoice);
		System.out.println(lowest);

		// display the details for the variables you declared in b)
		System.out.println(temperature);
		System.out.println(jackpotNo);
		System.out.println(populationChina);
		System.out.println(endGame);
		System.out.println(distance);
		System.out.println(grade);

	}

}
