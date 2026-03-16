package com.dkte;

public class Date {
 private int month;
 private int day;
 private int year;

 // Constructor
 public Date(int day,int month, int year) {
     this.month = month;
     this.day = day;
     this.year = year;
 }

 // Setter and Getter for Month
 public void setMonth(int month) {
     this.month = month;
 }

 public int getMonth() {
     return month;
 }

 // Setter and Getter for Day
 public void setDay(int day) {
     this.day = day;
 }

 public int getDay() {
     return day;
 }

 // Setter and Getter for Year
 public void setYear(int year) {
     this.year = year;
 }

 public int getYear() {
     return year;
 }

 // Display method
 public void displayDate() {
     System.out.println(day  + "/" + month+ "/" + year);
 }
}
