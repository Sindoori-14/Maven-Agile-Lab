package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAddBooks() {
        App library = new App();
        library.addBooks(10);
        assertEquals(10, library.getAvailableBooks());
    }

    @Test
    void testIssueBook() {
        App library = new App();
        library.addBooks(5);
        library.issueBook();
        assertEquals(4, library.getAvailableBooks());
    }

    @Test
    void testReturnBook() {
        App library = new App();
        library.addBooks(5);
        library.issueBook();
        library.returnBook();
        assertEquals(5, library.getAvailableBooks());
    }

    @Test
    void testIssueBookWhenNoBooksAvailable() {
        App library = new App();
        assertThrows(IllegalArgumentException.class, library::issueBook);
    }

    @Test
    void testInvalidAddBooks() {
        App library = new App();
        assertThrows(IllegalArgumentException.class, () -> library.addBooks(0));
    }
}
