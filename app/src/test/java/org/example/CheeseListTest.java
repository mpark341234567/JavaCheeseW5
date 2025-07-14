package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

public class CheeseListTest {
    @Test
    void cheeseListTest() {
        ArrayList<String> characteristics = new ArrayList<>(Arrays.asList("228", "NB", "Farmstead", "47.0", "Sharp, lactic", "Uncooked", "0", "Firm Cheese", "Ewe", "Raw Milk", "Washed Rind", "Sieur de Duplessis (Le)", "lower fat"));
        Cheese cheese = new Cheese(characteristics);
        
        ArrayList<Cheese> cheeseList = new ArrayList<>();
        cheeseList.add(cheese);
        
        assertFalse(cheeseList.isEmpty());
        assertEquals(1, cheeseList.size());
        assertEquals("Ewe", cheeseList.get(0).getMilkTypeEn());
    }
}
