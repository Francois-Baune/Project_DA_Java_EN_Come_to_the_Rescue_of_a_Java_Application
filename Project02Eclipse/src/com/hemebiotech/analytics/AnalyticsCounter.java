package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

/**
 *
 *
 */
public class AnalyticsCounter {
	private ISymptomReader readSymptomsRaw;
	private ISymptomWriter writeSymptoms;


	/**
	 * @param input a full or partial path to file with symptom strings in it, one per line
	 * @param output a full or partial path to file where we will write the analyzed and counted symptoms;
	 */
	public AnalyticsCounter(String input, String output){

		if ((input != null) && ( output != null) ) {
			readSymptomsRaw = new ReadSymptomDataFromFile(input);
			writeSymptoms = new WriteSymptomsToFile(output);
		}

	}

	void Analyse(){
		Map<String, Integer> symptomsClean = new LinkedHashMap<String,Integer>();

		List<String> symptomsRaw = readSymptomsRaw.GetSymptoms();
		Collections.sort(symptomsRaw);
		for(String symptom:symptomsRaw) {
			Integer count = symptomsClean.get(symptom);
			symptomsClean.put( symptom, ( count == null) ? 1 : count+1);
		}
		writeSymptoms.writeSymptoms(symptomsClean);
	}

}
