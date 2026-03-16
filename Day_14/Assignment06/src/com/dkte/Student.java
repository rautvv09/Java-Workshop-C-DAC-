package com.dkte;

import java.util.Scanner;

public class Student implements Comparable<Student> {
    private int rollno;
    private String name;
    private double marks;

    public Student() {
       
    }

    public Student(int rollno, String name, double marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public double getMarks() {
        return marks;
    }

    public void acceptstu(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();
        sc.nextLine(); // clear newline
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rollno, o.rollno);
    }

    @Override
    public String toString() {
        return "Student [Roll No=" + rollno + ", Name=" + name + ", Marks=" + marks + "]";
    }
}
