package com.capgemini.fileio;

import java.io.*;

/**
 * @author Pooja Karnik A Java WordCount Application
 *
 */

//program reads the number of words from a file and prints on the console
public class WordCountApp {

	public static void main(String[] args) throws IOException {

		String line;
		int countWord = 0;

		// setting path of the file
		File file = new File("C:\\pooja\\1.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		// reading the words from file 1.txt
		while ((line = reader.readLine()) != null) {
			if (!(line.equals(" "))) {
				String[] wordList = line.split("\\s+");
				countWord += wordList.length;
			}
		}
		System.out.println("Total word count = " + countWord);
	}
}
