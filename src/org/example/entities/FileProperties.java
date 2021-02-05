package org.example.entities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileProperties {

	// input.dir=data
	// input.file=POP.csv
	// output.dir=results
	// output.file=PopulationReport.txt
	// cutoff=3
	final static String CONFIGFILE = "config.properties";
	private String inputDir;
	private String inputFile;
	private String outputDir;
	private String outputFile;
	private int cutoff;

	public FileProperties() {
		// Read properties "config.properties"
		Properties prop = null;
		try {
			prop = new Properties();
			InputStream input = new FileInputStream(CONFIGFILE);

			prop.load(input);
		} catch (IOException e) {
			System.err.println(e.getMessage());
			System.exit(4);
		}
		//input
		setInputDir(prop.getProperty("input.dir"));
		String inputFileName = prop.getProperty("input.file");		
		setInputFile(getInputDir() 
				+ File.separator + inputFileName);
		//Output
		setOutputDir(prop.getProperty("output.dir"));
		String outputFileName = prop.getProperty("output.file");
		setOutputFile(getOutputDir()+ File.separator + outputFileName);
		
		
		String cutoffValue = prop.getProperty("cutoff");
		setCutoff(Integer.parseInt(cutoffValue));
	}

	public String getInputDir() {
		return inputDir;
	}

	public void setInputDir(String inputDir) {
		this.inputDir = inputDir;
	}

	public String getInputFile() {
		return inputFile;
	}

	public void setInputFile(String inputFile) {
		this.inputFile = inputFile;
	}

	public String getOutputDir() {
		return outputDir;
	}

	public void setOutputDir(String outputDir) {
		this.outputDir = outputDir;
	}

	public String getOutputFile() {
		return outputFile;
	}

	public void setOutputFile(String outputFile) {
		this.outputFile = outputFile;
	}

	public int getCutoff() {
		return cutoff;
	}

	public void setCutoff(int cutoff) {
		this.cutoff = cutoff;
	}

}
