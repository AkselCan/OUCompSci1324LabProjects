 import java.util.ArrayList;
 import java.util.Collections;
 import java.util.Scanner;
 import java.io.File;
 import java.io.FileNotFoundException;
 
/** Test the implementation of the Triangle class.
 * 
 * @author Deborah A Trytten
 *
 */
public class Driver {

	/** Demonstrate the use of aggregation by creating and modifying an ArrayList of Triangle
	 * objects.
	 * 
	 * @param args There are no command line arguments.
	 * @throws FileNotFoundException If the user entered data file is not found.
	 */
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner keyboard = new Scanner(System.in);
		
		// Objective 1--declare an ArrayList<Triangle>
		ArrayList<Triangle> list;
		
		System.out.println("Enter the name of the file");
		String fileName = keyboard.nextLine();
		
		// Objective 2--Read the contents of the ArrayList of Triangle objects from a file.
		list = readFromFile(fileName);
		
		// Objective 3--Print out the list, using the toString method in the ArrayList class.
		System.out.println("The original contents are");
		System.out.println(list.toString());
		
		//Objective 4--Call a method that prints out the Triangles in the ArrayList using the accessor methods in the Triangle class.
		System.out.println();
		System.out.println("Using Accessors");
		printList(list);
		
		// Objective 5--Set the lengths of all side As to a value that is read from the keyboard
		System.out.println();
		System.out.println("Enter the length of all side A");
		double a = keyboard.nextDouble();
		keyboard.nextLine();
		modifyAllSideA(list, a);
		System.out.println("After Side A changed");
		System.out.println(list);
		
		// Objective 6--Set the lengths of all side Bs to a value that is read from the keyboard
		System.out.println();
		System.out.println("Enter the length of all side B");
		double b = keyboard.nextDouble();
		keyboard.nextLine();
		modifyAllSideB(list, b);
		System.out.println("After Side B changed");
		System.out.println(list);
		
		// Objective 7--Set the lengths of all side Cs to a value that is read from the keyboard
		System.out.println();
		System.out.println("Enter the length of all side C");
		double c = keyboard.nextDouble();
		keyboard.nextLine();
		modifyAllSideC(list, c);
		System.out.println("After Side C changed");
		System.out.println(list);
		
		keyboard.close();
	}

	/** Use the accessor methods in the String class (not toString()) to print
	 * out the contents of a list.
	 * @param list The given list of Triangle objects.
	 */
	public static void printList(ArrayList<Triangle> list)
	{
		for (Triangle s: list) {
			System.out.println("Triangle: " + s.getSideA() + " " + s.getSideB() + " " + s.getSideC());
		}
	}
	
	/** Create a new ArrayList of Triangle obects that will store the data that is stored in
	 * a given file. The format of the file should be lines of three integral of floating
	 * point values, separated by spaces.
	 * @param fileName The name of the file that contains the data.
	 * @return A newly constructed ArrayList of Triangle objects that contains the data in the file.
	 * @throws FileNotFoundException If the given fileName cannot be found.
	 */
	public static ArrayList<Triangle> readFromFile(String fileName) throws FileNotFoundException
	{
		ArrayList<Triangle> list = new ArrayList<Triangle>();
		Scanner scnr = new Scanner(new File (fileName));
		while (scnr.hasNextLine()) {
			double a = scnr.nextDouble();
			double b = scnr.nextDouble();
			double c = scnr.nextDouble();
			scnr.nextLine();
			Triangle triangle = new Triangle (a, b, c);
			list.add(triangle);
		}
		
		return list;
	}
	
	/** Change all values of the first side of the Triangle to the given newValue.
	 * 
	 * @param list An initialized ArrayList of Triangle objects.
	 * @param newValue A new value for the first side of all triangles.
	 */
	public static void modifyAllSideA(ArrayList<Triangle> list, double newValue)
	{
		for(Triangle s: list) {
			s.setSideA(newValue);
		}
			
	}
	
	/** Change all values of the second side of the Triangle to the given newValue.
	 * 
	 * @param list An initialized ArrayList of Triangle objects.
	 * @param newValue A new value for the second side of all triangles.
	 */
	public static void modifyAllSideB(ArrayList<Triangle> list, double newValue)
	{
		for(Triangle s: list) {
			s.setSideB(newValue);
		}
			

	}
	
	/** Change all values of the third side of the Triangle to the given newValue.
	 * 
	 * @param list An initialized ArrayList of Triangle objects.
	 * @param newValue A new value for the third side of all triangles.
	 */
	public static void modifyAllSideC(ArrayList<Triangle> list, double newValue)
	{
		for(Triangle s: list) {
			s.setSideC(newValue);
		}
	}
}
