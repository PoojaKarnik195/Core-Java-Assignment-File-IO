package com.capgemini.fileio;

import java.io.File;

/**
 * @author Pooja Karnik A Java FileExist Application
 *
 */

//program checks if the file is present or not in the given location
public class FileExistApp {

	public static void main(String[] args) {

		// setting path of the file
		File file = new File("C:\\Pooja\\1.txt");

		// file checking
		if (file.exists()) {
			System.out.println("File Exists...");
		} else {
			System.out.println("File does not exist...");
		}
	}
}
