package org.example;

import java.util.ArrayList;

public class CheeseParser {
    public Cheese parse(ArrayList<String> s) {//takes in ArrayList and returns a Cheese object
        Cheese cheese = new Cheese(s);
        return cheese;
    }
    
}
