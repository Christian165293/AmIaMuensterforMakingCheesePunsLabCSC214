package com.csc;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CheeseWriterTest {
    @Test
    void testWriteData() {
        CheeseWriter writer = new CheeseWriter("test_output.txt");
        assertDoesNotThrow(() -> writer.write_data("Sample Output"));
    }
}