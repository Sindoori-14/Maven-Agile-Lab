package com.example;

public class App {

    private int availableBooks = 0;

    public void addBooks(int count) {
        if (count <= 0) {
            throw new IllegalArgumentException("Book count must be greater than zero");
        }
        availableBooks += count;
    }

    public void issueBook() {
        if (availableBooks <= 0) {
            throw new IllegalArgumentException("No books available to issue");
        }
        availableBooks--;
    }

    public void returnBook() {
        availableBooks++;
    }

    public int getAvailableBooks() {
        return availableBooks;
    }

    public static void main(String[] args) {
        App library = new App();

        library.addBooks(10);
        library.issueBook();
        library.returnBook();

        System.out.println("Available Books: " + library.getAvailableBooks());
    }
}
