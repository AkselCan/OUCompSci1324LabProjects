import java.util.Scanner;


public class Project6 {
	public static void main (String [] args) {

		Scanner keyboard = new Scanner(System.in);

		// Int declaration
		final int SENTINEL = -1;

		int countPositive = 0;

		int countNegative = 0;

		int countNoChange = 0;

		int countOne = 0;

		int countTwo = 0;

		int countThree = 0;

		int countFour = 0;

		int countFive = 0;

		int data;
		int number = 3;
		

		System.out.println ("Response Dial Simulator");
		System.out.println ("-----------------------");
		System.out.println("Initial setting: " + number);
		System.out.println("Enter the next setting (1-5) or -1 to stop.");
		// Priming Read
		data = keyboard.nextInt();


		// While Loop
		while(data!= SENTINEL) {
			// Value count
		if (data == 1) {

		countOne += 1;

		}

		else if (data == 2) {

		countTwo += 1;

		}

		else if (data == 3) {

		countThree += 1;

		}

		else if (data == 4) {

		countFour += 1;

		}

		else if (data == 5) {

		countFive += 1;

		}

		// Increase or decrease comparison
		if (number < data) {

		countPositive = countPositive + 1;

		System.out.println("Positive change: " + number + " to " + data);

		}

		else if (number > data) {

		countNegative = countNegative + 1;

		System.out.println("Negative change: " + number + " to " + data);

		}

		else if (number == data) {

		countNoChange = countNoChange + 1;

		System.out.println("No Change: " + number + " to " + data);

		}

		number = data;
		System.out.println ("Current setting: " + number);
		System.out.println("Enter the next setting (1-5) or -1 to stop.");

		data = keyboard.nextInt();


		}
		// Summary
		System.out.println("Response Summary");
		System.out.println("----------------");
		
		System.out.println("1 was chosen " + countOne + " time(s).");

		System.out.println("2 was chosen " + countTwo + " time(s).");

		System.out.println("3 was chosen " + countThree + " time(s).");

		System.out.println("4 was chosen " + countFour + " time(s).");

		System.out.println("5 was chosen " + countFive + " time(s).");
		System.out.println("\n");
	

		System.out.println("Positive changes: " + countPositive );

		System.out.println("Negative changes: " + countNegative );

		System.out.println("No Changes: " + countNoChange );




		}

		}
