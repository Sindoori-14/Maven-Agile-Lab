package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter User Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter User ID: ");
        String id = scanner.nextLine();

        System.out.print("Enter number of books issued: ");
        int numBooks = scanner.nextInt();
        scanner.nextLine(); // consume newline

        List<String> books = new ArrayList<>();
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter name of book " + (i + 1) + ": ");
            books.add(scanner.nextLine());
        }

        System.out.print("Enter number of days borrowed: ");
        int days = scanner.nextInt();

        double fine = calculateFine(days);

        // Display Summary
        System.out.println("\n--- Library Borrowing Report ---");
        System.out.println("User Name: " + name);
        System.out.println("User ID: " + id);
        System.out.println("Books Issued: " + books);
        System.out.println("Days Borrowed: " + days);
        System.out.println("Total Fine: ₹" + fine);

        scanner.close();
    }

    /**
     * Logic: Allowed limit is 7 days. 
     * Fine is ₹5.0 for every day beyond the limit.
     */
    public static double calculateFine(int days) {
        int allowedLimit = 7;
        double finePerDay = 5.0;
        if (days > allowedLimit) {
            return (days - allowedLimit) * finePerDay;
        }
        return 0.0;
    }
}
