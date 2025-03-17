package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheeseRowCleanerTest {
    @Test
    void testClean() {
        CheeseRowCleaner cleaner = new CheeseRowCleaner();
        assertEquals("test data", cleaner.clean("test data"));
    }
}