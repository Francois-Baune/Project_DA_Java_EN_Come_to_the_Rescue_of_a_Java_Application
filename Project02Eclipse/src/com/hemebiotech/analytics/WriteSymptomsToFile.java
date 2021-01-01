package com.hemebiotech.analytics;

import java.util.Map;

public class WriteSymptomsToFile implements ISymptomWriter {
    private String filepath;

    /**
     *
     * @param filepath a full or partial path to file where we will write the analyzed and counted symptoms;
     */
    public WriteSymptomsToFile (String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(Map Symptoms) {

    }
}
