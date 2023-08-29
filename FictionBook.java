package com.humber.asgmnts;
//Name: Elena Pashkova, N01587121;

//FictionBook subclass
public class FictionBook extends Book {
 public FictionBook(String title) {
     super(title);
     setPrice();
 }

 @Override
 public void setPrice() {
     price = 24.99;
 }

 @Override
 public String toString() {
     return "Fiction - " + super.toString();
 }
}
