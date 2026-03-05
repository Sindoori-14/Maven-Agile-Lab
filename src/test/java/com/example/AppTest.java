package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAdd() {
        App app = new App();
        assertEquals(15, app.add(10,5));
    }

    @Test
    public void testSubtract() {
        App app = new App();
        assertEquals(5, app.subtract(10,5));
    }
}
