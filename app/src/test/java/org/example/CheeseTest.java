package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CheeseTest {
    @Test
    void cheeseConstructorTest() {
        ArrayList<String> characteristics = new ArrayList<>(Arrays.asList("228", "NB", "Farmstead", "47.0", "Sharp, lactic", "Uncooked", "0", "Firm Cheese", "Ewe", "Raw Milk", "Washed Rind", "Sieur de Duplessis (Le)", "lower fat"));
        Cheese cheese = new Cheese(characteristics);
        
        assertEquals("Ewe", cheese.getMilkTypeEn());
        assertEquals("Raw Milk", cheese.getMilkTreatmentTypeEn());
        assertEquals(0, cheese.getOrganic());
        assertEquals(47.0, cheese.getMoisturePercent(), 0.01);
    }

    @Test
    void cheeseNumberFunctionsTest() {
        CheeseReader cheeseReader = new CheeseReader("C:/Coding Projects/GitHub/JavaCheeseW5/app/src/test/java/org/example/cheese_data.csv");
        CheeseList cheeseList = cheeseReader.readCheeses();
        
        assertEquals(1042, cheeseList.numberOfCheeses());
        assertEquals(800, cheeseList.numberOfCheesesWithMilkTreatmentType("Pasteurized"));
        assertEquals(57, cheeseList.numberOfCheesesWithMoistureOverAndOrganic(40.1));
        assertEquals(743, cheeseList.numberOfCheesesWithMilkType("Cow"));
    }
}
