package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheeseTest {
    @Test
    void testCheeseCreation() {
        Cheese cheese = new Cheese("1", "pasteurized", 1, 42.5, "Cow");

        assertEquals("pasteurized", cheese.getMilkTreatmentTypeEn());
        assertEquals(1, cheese.getOrganic());
        assertEquals(42.5, cheese.getMoisturePercent(), 0.01);
        assertEquals("Cow", cheese.getMilkTypeEn());
    }
}