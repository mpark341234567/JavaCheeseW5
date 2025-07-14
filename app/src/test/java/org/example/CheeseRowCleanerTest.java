package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CheeseRowCleanerTest {
    @Test
    void cleanTest() {
        CheeseRowCleaner rowCleaner = new CheeseRowCleaner();

        ArrayList<String> testArray = new ArrayList<>(Arrays.asList("228", "NB", "Farmstead", "47.0", "Sharp, lactic", "Uncooked", "0", "Firm Cheese", "Ewe", "Raw Milk", "Washed Rind", "Sieur de Duplessis (Le)", "lower fat")); 
        assertEquals(testArray, rowCleaner.clean("228,NB,Farmstead,47.0,\"Sharp, lactic\",Uncooked,0,Firm Cheese,Ewe,Raw Milk,Washed Rind,Sieur de Duplessis (Le),lower fat")); 
    }
}
