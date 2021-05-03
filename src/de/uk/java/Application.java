package de.uk.java;

import java.util.List;

public class Application {
	
	public static void main(String[] args) {
		//read file
		List<String> wordsList = FileScanner.scanFileToList("scanThis_Kafka.txt");
		
		// list of words and print the list and word count
		System.out.println("Die Datei beinhaltet: " + wordsList.size() + " Wörter.");
		System.out.println(wordsList);
		
		// sort with comparator for length
		wordsList.sort(new WordLengthComparator());
		
		//print sorted list
		System.out.println(wordsList);
		
		
	}

}
