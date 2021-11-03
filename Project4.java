import java.util.Scanner;

public class Project4 {
	public static void main(String [] args ) {
		
	int sum = 0;
	String answer;
	String value1 = "Yes";
	int none = 0;
	int low = 1;
	int med = 2;
	int high = 3;
	Scanner keyboard = new Scanner(System.in);
	
	
	System.out.println("Answer yes or no to the following questions");

	System.out.println("I am losing my sense of humor.");
	answer = keyboard.nextLine();
	
	if (answer.equalsIgnoreCase("Yes")) {
		sum += 1;
	}
	else {
		sum = sum + 0;
			}

	System.out.println("I find it more and more to see people socially.");
	answer = keyboard.nextLine();
	if (answer.equalsIgnoreCase("Yes")) {
		sum += 1;
	}
	else {
		sum += 0;
	}
	
	System.out.println("I feel tired most of the time.");
	answer = keyboard.nextLine();
	if (answer.equalsIgnoreCase("Yes")) {
			sum += 1;
	}
	else {
		sum += 0;
	}
	
	if (sum == none) {
		System.out.println("You are more exhausted than stressed out");
	}
	else if (sum == low) {
		System.out.println("You are beginning to stress out.");
	}
	else if (sum == med) {
		System.out.println("You are possibly stressed out.");
	}
	else if (sum == high) {
		System.out.println("You are probably stressed out.");
	}
	
	
	}
}
	


