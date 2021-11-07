import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Project8 {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String filename = keyboard.next();
		
		
		String [] array = readFile(filename);
		lowercase(array);
		String mostFrequentMovie = findMostFrequent(array);
		
		System.out.print("Most popular movie: " + mostFrequentMovie);
	}
	// First method sorting the text file
	public static String[] readFile(String filename) throws FileNotFoundException {
		Scanner input = new Scanner (new File(filename));
		
		int size = 0;
		
		while (input.hasNextLine()) {
			input.nextLine();
			size++;
		}
		
		String [] array = new String [size];
		input.close();
		
		input = new Scanner (new File(filename));
		int i;
		for (i = 0; i < size; ++i) {
			array [i] = input.nextLine();
		}
		input.close();
	return array;
	}
	// Second method turning every character to lowercase for every movie title
	public static void lowercase(String[] array) {
		int x;
		for (x = 0; x < array.length; ++x) {
			String movieName = array[x];
			movieName = movieName.toLowerCase();
			array[x] = movieName;
		}
	}
	// Third method finding the most frequent movie
	public static String findMostFrequent(String[] array) {
		Arrays.sort(array);
		int y;
		int max = 0;
		int count = 0;
		String mostFrequentMovie = "";
		for (y = 0; y < array.length - 1; ++y) {
			if (array[y].equals(array[y + 1])) {
				count++;
				if (count > max) {
					max = count;
					mostFrequentMovie = array[y];
				}
			}
			else {
				count = 1;
			}
		}
		
	return mostFrequentMovie;
	}
	}

