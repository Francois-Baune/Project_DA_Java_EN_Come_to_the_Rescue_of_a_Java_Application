package com.hemebiotech.analytics;

import java.util.List;

public class Launcher {

    final static String INPUT_PATH = "Project02Eclipse/symptoms.txt";
    final static String OUTPUT_PATH = "Project02Eclipse/results.out";

    public static void main(String args[]) throws Exception {

        ISymptomReader readSymptomsRaw = new ReadSymptomDataFromFile(INPUT_PATH);
        ISymptomWriter Symptomswriter = new WriteSymptomsToFile(OUTPUT_PATH);

        List<String> symptomsRaw = readSymptomsRaw.getSymptoms();
        Symptomswriter.writeSymptoms(AnalyticsCounter.analyse(symptomsRaw));
    }
}
