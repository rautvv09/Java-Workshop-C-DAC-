package com.dkte;

public class DateTest {
 public static void main(String[] args) {
     
     Date myDate = new Date(6, 25, 2025);

    
     System.out.print("The date is: ");
     myDate.displayDate();

     myDate.setDay(31);
     myDate.setMonth(12);
     myDate.setYear(2024);

     
     System.out.print("Updated date is: ");
     myDate.displayDate();

    
//     System.out.println("Month: " + myDate.getMonth());
//     System.out.println("Day: " + myDate.getDay());
//     System.out.println("Year: " + myDate.getYear());
 }
}
