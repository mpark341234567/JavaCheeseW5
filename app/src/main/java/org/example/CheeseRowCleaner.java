package org.example;

import java.util.ArrayList;

public class CheeseRowCleaner {//separates important information
    public ArrayList<String> clean(String line) {
        line = line.trim();//removes whitespace from line
        String data;
        int startingIndex = 0;
        ArrayList<String> storedInfo = new ArrayList<>();
        for (int i = 0; i < (line.length()); i++) {
            if (line.charAt(i) == '"') {//If quotes are found
                int temp = inQuotes(line, i+1);//finds the next quote
                data = line.substring((i+1), temp - 1);//extracts the data between the quotes
                storedInfo.add(data);//adds the data to the list
                i = temp;//sets iterator to next character after 2nd quotes
                startingIndex = i + 1;//sets starting index to the next character
                if (line.charAt(startingIndex) == '"'){
                    startingIndex++;//if the next character is a quote, skip it
                }
            }
            else if ((line.charAt(i) == ',')) {
                data = line.substring(startingIndex, i);
                storedInfo.add(data);//adds the data to the list
                startingIndex = i + 1;//sets starting index to the next character
            }
        }
        data = line.substring(startingIndex);//extracts the last piece of data
        storedInfo.add(data);//adds the last piece of data to the list
        return storedInfo;
    }

    public int inQuotes(String s, int i) {//find the index of the 2nd quote
        for (int j = i; j < s.length(); j++) {//iterates over each char in the quotes
            if (s.charAt(j) == ('"')){//if we find a quote,
                if (((j + 1) < s.length()) && (s.charAt(j + 1)==('"'))) {//verify that j + 1 is not at the end of the string or that the char after the current char is a quote as well
                    j++;//move past the quote
                }
            else {
                return j + 1;//returns if we find a single quote
            }
        }     
    }   
         return -1;//returns if a single quote couldn't be found
    }
}
