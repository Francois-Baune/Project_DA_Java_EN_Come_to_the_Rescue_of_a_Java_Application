package com.hemebiotech.analytics;

import java.util.*;

/**
 * This class, when analyse() is called wil analyze and count a list of symptoms
 * and then will generate a text file where each symptoms will be written alphabetically with it's number of iteration.
 */
public class AnalyticsCounter {
	private ISymptomReader readSymptomsRaw;
	private ISymptomWriter writeSymptoms;


	/**
	 *
	 * @param input a full or partial path to file with symptom strings in it, one per line
	 * @param output a full or partial path to file where we will write the analyzed and counted symptoms;
	 */
	public AnalyticsCounter(String input, String output){

		if ((input != null) && ( output != null) ) {
			readSymptomsRaw = new ReadSymptomDataFromFile(input);
			writeSymptoms = new WriteSymptomsToFile(output);
		}

	}

	/**
	 *  This method will analyse the raw list of symptoms provided by {@link ReadSymptomDataFromFile }.GetSymptoms()
	 *  From this list, it'll create a Map with each symptoms and it's number of iteration in the input file.
	 *  It'll then call {@link WriteSymptomsToFile}.writeSymptoms to write in the file
	 *
	 */
	void analyse(){
		Map<String, Integer> symptomsClean = new LinkedHashMap<String,Integer>();

		List<String> symptomsRaw = readSymptomsRaw.getSymptoms();
		Collections.sort(symptomsRaw);
		for(String symptom:symptomsRaw) {
			Integer count = symptomsClean.get(symptom);
			symptomsClean.put( symptom, ( count == null) ? 1 : count+1);
		}
		writeSymptoms.writeSymptoms(symptomsClean);
	}

}
