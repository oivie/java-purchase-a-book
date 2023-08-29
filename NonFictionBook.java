package com.humber.asgmnts;
//Name: Elena Pashkova, N01587121;

//NonFictionBook subclass
public class NonFictionBook extends Book {
 public NonFictionBook(String title) {
     super(title);
     setPrice();
 }

 @Override
 public void setPrice() {
     price = 37.99;
 }

 @Override
 public String toString() {
     return "NonFiction - " + super.toString();
 }
}
