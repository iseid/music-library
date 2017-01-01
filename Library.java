
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Library {

	public static Music[] arrayTitles; 

	public static void readLibrary(String inputFile) {
		try {
			Scanner keyboard = new Scanner(new File(inputFile));
			int numTitles = keyboard.nextInt();
			keyboard.nextLine();
			arrayTitles = new Music[numTitles];

			for(int i=0; i < numTitles; i++) {
				String title = keyboard.nextLine();
				String album = keyboard.nextLine();
				String artist = keyboard.nextLine();
				int year = keyboard.nextInt();
				
				keyboard.nextLine();
				arrayTitles[i] = new Music(title, album, artist, year);
			}
			keyboard.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	public static void writeLibrary(String outputFile) {
		try {
			PrintWriter output = new PrintWriter(new File(outputFile));
			
			int number = 1;
			double cost = 0;
			
			for(int i= 0; i<arrayTitles.length; i++) {
				output.println(number + ": " +arrayTitles[i].toString());
				cost += arrayTitles[i].getPrice();
				number++;

			}
			
			output.println("Number of Tracks: " + (number-1));
			output.printf("Total cost: $" + cost );
			output.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	 public static void searchTitles(String search) {
		 for(int i=0; i < arrayTitles.length; i++) {
			 String title = arrayTitles[i].getTitle();
			 
			 if (title.contains(search)) {
				 System.out.println((i+1) + ": " + arrayTitles[i].toString());
			 }	 
		 }
	 }
	 
	 public static void sortTitles() {
		 for(char c = 'A'; c<= 'Z'; c++) {
			 for(int i=0; i<arrayTitles.length; i++) {
				 String title = arrayTitles[i].getTitle();
				 if(title.charAt(0) == c) {
					 System.out.println((i+1) + ": " + arrayTitles[i].toString());
				 }
			 }
		 }
		 
	 }

	public static void main(String[] args) {
		readLibrary(args[0]);
		
		int number =1;
		double cost = 0;

		for(int i= 0; i<arrayTitles.length; i++) {
			System.out.println(number + ": " +arrayTitles[i].toString());
			cost += arrayTitles[i].getPrice();
			number++;
		}
		System.out.println("Number of Tracks: " +(number-1));
		System.out.print("Total cost: $");
		System.out.printf("%.2f\n" , cost);
		System.out.println();
		
		sortTitles();
		

	}
}

