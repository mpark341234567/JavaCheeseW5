package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class CheeseWriter {
    private String fileName;

    public CheeseWriter(String outputFileName) {
        fileName = outputFileName;
    }

    public void writeData(String string) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.write(string);
            writer.newLine();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
    }
    }

    public void clearData(){
        try{
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName, false));
            writer2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}