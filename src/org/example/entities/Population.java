package org.example.entities;
/**
 * Population is an entity class for this project that handles the data portion of the program.
 * 
 * @author Rostom Sahakian
 */
public class Population {

	// Country Code
	// Population ranking
	// Country Name
	// Population (in 1000's)
	private String code;
	private int rank;
	private String name;
	private int population;
	/**
	 * Constructor for Population class. It sets the values
	 * received from record
	 *
	 * @param		record	a String Object
	 * @return		none 
	 *
	 */
	public Population(String record) {
		String[] fields = record.split(",");
		setCode(fields[0]);
		int temp = Integer.parseInt(fields[1]);
		setRank(temp);
		setName(fields[2]);
		temp = Integer.parseInt(fields[3]);
		setPopulation(temp * 1000);
	}
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	/**
	 * Compares the given value 
	 * if >= then it returns true else it returns false
	 * 
	 * 
	 * @param cutoff
	 * @return	boolean true/false
	 */

	public boolean isLarge(int cutoff) {
		
		int temp = cutoff * 1000000;
		if (getPopulation() >= temp) {
			return true;
		} else {
			return false;
		}
	}
	// a fixed format file:
	// 35 char, right justified, country name
	// " - "
	// 3 char country code
	// ":"
	// the population
	public String format()
	{
		return String.format("%-3d. %35s - %3s : %,d", rank,name, code, population);
	}

}
