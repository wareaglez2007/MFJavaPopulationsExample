package org.example.population;

/**
 * Code Assignment 3 Example (Project)
 * see package notes for what this program does
 * 
 * @author Rostom Sahakian
 * 02-04-2021
 * IRS - Java Mainframe Immersion course
 *
 */
import java.io.IOException;

import org.example.actions.*;
import org.example.entities.*;


public class PopulationAppl {

	public static void main(String[] args) throws IOException {

		// Please run this code on your PC, then run it
		// on the Mainframe
		// ---->START IN MAIN And DESIGN HERE
		// get the properties,
		//String configFileName = "config.properties";  CONTSTANT DECLARED IN FlePrpoerties Class
		//Instantiate FileProperties entity class
		FileProperties config = new FileProperties();
		
		// Open input file (Reader action class)
		PopulationFileReader popReader = new PopulationFileReader();
		popReader.openFile(config.getInputFile());

		// Open output file (Writer action class)
		PopulationFileWriter popWriter = new PopulationFileWriter();
		popWriter.openFile(config.getOutputFile());

		while (true) {
			// read a line
			String record = popReader.readLine();

			// check if end of file
			if (record == null) {
				break;
			}
			//Instantiate Population entity class
			Population currentEntity = new Population(record);

			// if the entity.record >= cutoff

			if (currentEntity.isLarge(config.getCutoff())) {
				popWriter.writeLine(currentEntity.format());
				System.out.println(currentEntity.format()); //Testing console
			}
		}

		// Close output file
		popWriter.close();
		// close input file
		popReader.close();

	}

}
