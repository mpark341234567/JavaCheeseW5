package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class CheeseReader {
    private String fileName;
    private CheeseParser parser = new CheeseParser();
    private CheeseRowCleaner rowCleaner = new CheeseRowCleaner();

    public CheeseReader(String fileName) {
        this.fileName = fileName;
    }

    public CheeseList readCheeses() {
        CheeseList list = new CheeseList();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {//reads each line of the file
                Cheese cheese = deserializeCheese(line);//converts the line into a Cheese object
                list.addCheese(cheese);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
    }
        return list;
    }

    public Cheese deserializeCheese(String line) {
        ArrayList<String> cleanedList = rowCleaner.clean(line);
        Cheese cheese = parser.parse(cleanedList);
        return cheese;
    }
}
