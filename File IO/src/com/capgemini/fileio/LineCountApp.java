package com.capgemini.fileio;

import java.io.*;

/**
 * @author Pooja Karnik A Java LineCount Application
 *
 */

//program reads the number of lines from a file and prints on the console
public class LineCountApp {

	public static void main(String[] args) throws IOException {

		String line;
		int lineCount = 0;

		// setting path of the file
		File file = new File("C:\\pooja\\1.txt");
		FileInputStream fileStream = new FileInputStream(file);
		InputStreamReader input = new InputStreamReader(fileStream);
		BufferedReader reader = new BufferedReader(input);

		// reading the lines from file 1.txt
		while ((line = reader.readLine()) != null) {
			if (!(line.equals(" "))) {
				String[] lineList = line.split("[!?.:]+");
				lineCount += lineList.length;
			}
		}
		System.out.println("Total line count = " + lineCount);
	}
}
