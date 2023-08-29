package com.humber.asgmnts;
//Name: Elena Pashkova, N01587121;

//Bill class
public class Bill {
 private String customerName;
 private Book[] books;
 private int bookCount;
 private double billAmount;

 public Bill(String customerName) {
     this.customerName = customerName;
     books = new Book[10];
     bookCount = 0;
     billAmount = 0.0;
 }

 public void addBook(Book book) {
     if (bookCount < 10) {
         books[bookCount] = book;
         bookCount++;
         billAmount += book.getPrice();
     } else {
         System.out.println("Maximum book limit reached.");
     }
 }

 public void printBill() {
     System.out.println("Customer: " + customerName);
     System.out.println("Books Purchased:");
     for (int i = 0; i < bookCount; i++) {
         System.out.println(books[i]);
     }
     System.out.println("Total Bill Amount: $" + billAmount);
 }
}