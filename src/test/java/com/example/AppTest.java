package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testNoFineWithinLimit() {
        // Borrowing for 7 days (the limit) should result in 0 fine
        assertEquals(0.0, App.calculateFine(7), "Fine should be 0 for 7 days");
    }

    @Test
    public void testFineCalculation() {
        // Borrowing for 10 days (3 days extra)
        // 3 * 5.0 = 15.0
        assertEquals(15.0, App.calculateFine(10), "Fine should be 15.0 for 10 days");
    }

    @Test
    public void testZeroDays() {
        assertEquals(0.0, App.calculateFine(0), "Fine should be 0 for 0 days");
    }
}
