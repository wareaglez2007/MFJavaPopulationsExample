package org.example.actions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
/**
 * Class written for population assignment to
 * write given output into a file
 * 
 * @author Rostom Sahakian
 * 02-04-2021
 * 
 * @version 1
 * @see 	https://docs.oracle.com/javase/8/docs/api/java/io/Writer.html
 */
public class PopulationFileWriter {

	private BufferedWriter writer;

	public void openFile(String outputFile) throws IOException {

		writer = new BufferedWriter(new FileWriter(outputFile));

	}

	public void close() throws IOException {

		writer.close();
	}

	public void writeLine(String line) throws IOException
	{
		writer.write(line + "\n");
	}

}
