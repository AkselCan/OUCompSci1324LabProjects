import java.util.Arrays;
import java.util.Scanner;

public class Project9 
{

	public static void main(String[] args) 
	{
		// Do not edit this method
		Scanner keyboard = new Scanner(System.in);
		
		String line = keyboard.nextLine();
		String [] numbers = line.split(" ");
		int[] array = new int[numbers.length];
		// Test after && is unnecessary, but better to be safe than sorry
		for (int index = 0; index<numbers.length && index < array.length; ++index)
		{
			array[index] = Integer.valueOf(numbers[index]);
		}
		
		int start = keyboard.nextInt(); // Did not read in newline here because people may put both
										// bounds on one line
		int end = keyboard.nextInt();
		keyboard.nextLine();
		
		int[] result = subArray(array, start, end);
		
		System.out.println(Arrays.toString(result));
		keyboard.close();
	}
	
	// Start and end are inclusive--this is different than the usual practice in Java
	public static int[] subArray(int[] source, int start, int end)
	{
		int [] emptyArray = new int [0];
		int indexOne = 0;
		int indexTwo = 0;
		for (int i = 0; i < source.length; i++) {
		   if (source [i] != start || source[i] != end) {
		      return emptyArray;
		   }
		}
		
		for (int i = 0; i < source.length; i++) {
		   if (source[i] == start) {
		      indexOne = i;
		   }
		}
		for(int i = 0; i < source.length; i++) {
		   if (source[i] == end) {
		      indexTwo = i;
		   }
		}

		
		emptyArray = Arrays.copyOfRange(source, indexOne, indexTwo + 1);
		
		
	
		return emptyArray; // Edit this line
	}
}
