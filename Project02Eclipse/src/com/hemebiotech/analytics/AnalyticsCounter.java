package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;

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

	}

}
