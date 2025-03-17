package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheeseListTest {
    @Test
    void testAddCheese() {
        CheeseList cheeseList = new CheeseList();
        Cheese cheese = new Cheese("2", "raw milk", 0, 35.0, "Goat");
        cheeseList.addCheese(cheese);

        assertEquals(1, cheeseList.numberOfCheeses());
        assertTrue(cheeseList.getCheeses().contains(cheese));
    }
}