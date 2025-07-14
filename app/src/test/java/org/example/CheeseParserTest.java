package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CheeseParserTest {
    @Test
    void parseTest() {
        ArrayList<String> characteristics = new ArrayList<>(Arrays.asList("228", "NB", "Farmstead", "47.0", "Sharp, lactic", "Uncooked", "0", "Firm Cheese", "Ewe", "Raw Milk", "Washed Rind", "Sieur de Duplessis (Le)", "lower fat"));
        CheeseParser parser = new CheeseParser();
        Cheese cheese = parser.parse(characteristics);
        
        assertNotNull(cheese);
        assertEquals("Ewe", cheese.getMilkTypeEn());
        assertEquals("Raw Milk", cheese.getMilkTreatmentTypeEn());
    }
}
