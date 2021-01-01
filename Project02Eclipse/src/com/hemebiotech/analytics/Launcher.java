package com.hemebiotech.analytics;

public class Launcher {

    final static String INPUT_PATH = "Project02Eclipse/symptoms.txt";
    final static String OUTPUT_PATH = "Project02Eclipse/results.out";

    public static void main(String args[]) throws Exception {

        AnalyticsCounter aSymptoms = new AnalyticsCounter(INPUT_PATH,OUTPUT_PATH);
        aSymptoms.Analyse();
    }
}
