package com.hemebiotech.analytics;

public class WriteSymptomsToFile implements ISymptomWriter {
    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file where we will write the analyzed and counted symptoms;
     */
    public WriteSymptomsToFile (String filepath) {
        this.filepath = filepath;
    }

}
