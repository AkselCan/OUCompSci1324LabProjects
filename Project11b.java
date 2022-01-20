import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project11b {
	public static void main (String [] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your name");
		String myFile = keyboard.nextLine() + ".txt";
		String[] myFriends = readArrayFromFile(myFile);
		System.out.println("Enter your friend's name");
		String friendName = keyboard.nextLine();
		String friendFile = friendName + ".txt";
		while (!friendName.equalsIgnoreCase("Quit"))
		{
		String mutualFriend = findMutualFriend(myFriends,friendFile);
		if (mutualFriend == null) {
		  System.out.println("You two do not have a mutual friend");
		}
		else {
		System.out.println(mutualFriend + " is a mutual friend");
		}
		System.out.println("enter your friend's name");
		friendName = keyboard.nextLine();
		friendFile = friendName + ".txt";
		}
		System.out.println("Bye");
		}
	public static String [] readArrayFromFile(String fileName) throws FileNotFoundException {
		Scanner input = new Scanner (new File(fileName));
		int size = 0;
		while (input.hasNextLine()) {
			input.nextLine();
			size = size + 1;
		}
		input.close();
		
		Scanner keyboard = new Scanner (new File(fileName));
		
        String [] mine = new String [size];

		int i;
		for (i = 0; i < size; ++i) {
			 mine [i] = keyboard.nextLine();
		}
		keyboard.close();
	return mine;	
	}
	public static String findMutualFriend(String[] mine, String fileName) throws FileNotFoundException {
		for (int i = 0; i < mine.length; ++i)
		{
		boolean answer = contains(fileName, mine[i]);
		if (answer == true)
		{
		return mine[i];
		}
		}
		return null;
		}
		
	public static boolean contains(String fileName, String element) throws FileNotFoundException {
		Scanner sc = new Scanner (new File(fileName));
		while (sc.hasNextLine()) {
	        String line = sc.nextLine();
	        if(line.equals(element)) { 
	           return true;
	        }
	    }
		return false;
	}
}
