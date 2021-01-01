package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
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
    public void writeSymptoms(Map<String,Integer> symptoms) {

        try (FileWriter writer = new FileWriter(filepath);
                BufferedWriter outputBW = new BufferedWriter(writer)) {

            for (Map.Entry<String,Integer> pair : symptoms.entrySet()) {
                outputBW.write( pair.getKey() + "=" + pair.getValue() + "\n");
            }

        } catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }

    }
}
