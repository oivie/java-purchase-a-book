package com.humber.asgmnts;
//Name: Elena Pashkova, N01587121;

//Abstract class Book
public abstract class Book {
 protected String title;
 protected double price;

 public Book(String title) {
     this.title = title;
 }

 public String getTitle() {
     return title;
 }

 public double getPrice() {
     return price;
 }

 public abstract void setPrice();

 @Override
 public String toString() {
     return title + " - $" + price;
 }

 @Override
 public boolean equals(Object obj) {
     if (obj == this) {
         return true;
     }
     if (!(obj instanceof Book)) {
         return false;
     }
     Book otherBook = (Book) obj;
     return title.equals(otherBook.title);
 }
}