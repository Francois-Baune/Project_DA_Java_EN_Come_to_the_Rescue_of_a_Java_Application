package com.hemebiotech.analytics;

import java.util.*;

/**
 *
 *
 */
public class AnalyticsCounter {


	/**
	 *
	 * @param symptomsRaw a List of symptom. Symptoms can be writen at multiple location, and the list don't need to be sorted.
	 * @return a Map<String,Integer> of symptoms and its number of occurence, the Map is sorted alphabetically
	 */
	public static Map<String,Integer> analyse(List<String> symptomsRaw){
		Map<String, Integer> symptomsClean = new TreeMap<String,Integer>();

		for(String symptom:symptomsRaw) {
			Integer count = symptomsClean.get(symptom);
			symptomsClean.put( symptom, ( count == null) ? 1 : count+1);
		}
		return symptomsClean;
	}

}
