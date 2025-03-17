package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheeseParserTest {
    @Test
    void testParseValidData() {
        CheeseParser parser = new CheeseParser();
        Cheese cheese = parser.parse("3,SomeName,SomeType,45.0,SomeData,SomeMoreData,1,Goat,pasteurized");

        assertNotNull(cheese);
        assertEquals("pasteurized", cheese.getMilkTreatmentTypeEn());
        assertEquals(1, cheese.getOrganic());
        assertEquals(45.0, cheese.getMoisturePercent(), 0.01);
        assertEquals("Goat", cheese.getMilkTypeEn());
    }

    @Test
    void testParseInvalidData() {
        CheeseParser parser = new CheeseParser();
        Cheese cheese = parser.parse("CheeseId,Name,Type,Moisture,Data,Data,Organic,MilkType,Treatment");

        assertNull(cheese);
    }
}