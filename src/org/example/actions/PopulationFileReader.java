package org.example.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
//import java.io.FileReader;
import java.io.IOException;

public class PopulationFileReader {

	
	private BufferedReader reader;

	public void openFile(String inputFile) throws FileNotFoundException {
		// Here I need to open the "reader" using the file name passed to me
		reader = new BufferedReader(new FileReader(inputFile));
	}

	public void close() throws IOException {
		reader.close();

	}
	/**
	 * reads the given line given by user input
	 * 
	 * @return record
	 * @throws IOException
	 */
	public String readLine() throws IOException {
		String record = reader.readLine();
		return record;
	}



}
