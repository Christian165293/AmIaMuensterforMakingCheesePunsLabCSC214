package com.csc;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheeseReader {
    private final String fileName;
    private final CheeseParser parser = new CheeseParser();
    private final CheeseRowCleaner cleaner = new CheeseRowCleaner();

    public CheeseReader(String inputFileName) {
        fileName = inputFileName;
    }

    public CheeseList read_cheeses() {
        CheeseList list = new CheeseList();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                Cheese cheese = deserialize_cheese(line);
                if (cheese != null) { // Skip rows that return null
                    list.addCheese(cheese);
                }
            }
            reader.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    private Cheese deserialize_cheese(String line) {
        String cleaned_line = cleaner.clean(line);
        return parser.parse(cleaned_line);
    }
}

