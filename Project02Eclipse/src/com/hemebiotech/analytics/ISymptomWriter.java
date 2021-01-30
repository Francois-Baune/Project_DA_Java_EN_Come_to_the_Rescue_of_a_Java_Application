package com.hemebiotech.analytics;

import java.util.Map;

/**
 *
 * Interface for classes that will record the map of symptoms and their occurrences into something.
 *
 */
public interface ISymptomWriter {

    /**
     *
     * @param symptoms a map of symtoms and the number of occurences of each one
     */
    void writeSymptoms(Map<String,Integer> symptoms);
}
