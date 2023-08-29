package com.humber.asgmnts;
import java.util.Scanner;


//Main class
public class Assignment4 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Get customer name
     System.out.print("Enter customer name: ");
     String customerName = scanner.nextLine();
     Bill bill = new Bill(customerName);

     while (true) {
         // Display menu
         System.out.println("Menu:");
         System.out.println("1. Purchase a Book");
         System.out.println("2. Display Bill");
         System.out.println("3. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

         if (choice == 1) {
             // Purchase a book
             System.out.print("Enter book title: ");
             String bookTitle = scanner.nextLine();
             System.out.print("Enter book category (Fiction/NonFiction): ");
             String category = scanner.nextLine();

             Book book;
             if (category.equalsIgnoreCase("Fiction")) {
                 book = new FictionBook(bookTitle);
             } else if (category.equalsIgnoreCase("NonFiction")) {
                 book = new NonFictionBook(bookTitle);
             } else {
                 System.out.println("Invalid category.");
                 continue;
             }

             bill.addBook(book);
             System.out.println("Book added to the bill.");
         } else if (choice == 2) {
             // Display bill
             bill.printBill();
         } else if (choice == 3) {
             // Exit
             System.out.println("Exiting the application.");
             break;
         } else {
             System.out.println("Invalid Choice.");
         }
         System.out.println(); // Blank line
     
     }

     scanner.close();
 }
}
