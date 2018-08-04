package com.capgemini.fileio;

import java.util.*;
import java.io.*;

/**
 * @author Pooja Karnik A Java grep Application
 *
 */

//program obtains the search string and file from user and checks if it is present or not in the given file
public class GrepApp {

	public static void main(String[] args) throws FileNotFoundException {

		int count = 0, notFound = 0;

		// setting path of the file
		File file = new File("C:\\pooja\\1.txt");
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(file);

		System.out.println("Please enter the search string :");
		String name = scanner.nextLine();

		System.out.println("Please enter the file name");
		String file1 = scanner.nextLine();

		// reading the word from file 1.txt
		while (input.hasNextLine()) {
			String line = input.nextLine();
			if (line.contains(name)) {
				count += 1;
				System.out.println("String " + name + " occurs at line/s " + line + " found at line number " + count);
			} else {
				count += 1;
				notFound++;
			}
		}
		if (count == notFound) {
			System.out.println("String " + name + " not found");
		}
	}
}
