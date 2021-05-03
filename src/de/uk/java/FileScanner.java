package de.uk.java;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileScanner {

	public static List<String> scanFileToList(String filePath ) {
		// create list to add words to
		List<String> tokenList = new ArrayList<String>();
		//new File and Scanner
		File f = new File(filePath);
		Scanner s;
		
		// try creating the scanner with the given file
		try {
			s = new Scanner(f);
			
			//set delimiter
			s.useDelimiter(" ");
			
			while(s.hasNext()) {
				// cleanup and add the seperated words to the list
				tokenList.add(s.next().replaceAll("[^a-zA-Z 0-9]", ""));
			}
			s.close();
			
			//if the file was not found
		} catch (FileNotFoundException e) {
			System.err.println("File given couldn't be found. Maybe it doesn't exist?");
			e.printStackTrace();
		}
		return tokenList;
	}
}
