package com.hemebiotech.analytics;

import java.util.List;

public class Launcher {

    final static String INPUT_PATH = "Project02Eclipse/symptoms.txt";
    final static String OUTPUT_PATH = "Project02Eclipse/results.out";


    /**
     *
     * Main function, that will call the 3 classes : ReaderSymptomDataFromFile, Analysicscounter, and WriterSymptoms to file,
     * so that we have a functioning program and write the symptoms and their number of occurence in OUTPUT_PATH
     *
     */
    public static void main(String args[]) throws Exception {

        ISymptomReader readSymptomsRaw = new ReaderSymptomDataFromFile(INPUT_PATH);
        ISymptomWriter Symptomswriter = new WriterSymptomsToFile(OUTPUT_PATH);

        List<String> symptomsRaw = readSymptomsRaw.getSymptoms();
        Symptomswriter.writeSymptoms(AnalyticsCounter.analyse(symptomsRaw));
    }
}
