//package com.sunbeam;

class Student {
	int rollno;
	String name;
	double marks;

	public Student() {
	}

	public Student(int rollno, String name, double marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public void acceptStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll No: ");
		rollno = sc.nextInt();
		sc.nextLine(); // consume leftover newline

		System.out.print("Enter Name: ");
		name = sc.nextLine();

		System.out.print("Enter Marks: ");
		marks = sc.nextDouble();	
	}

	public void displayStudent() {
		System.out.println("Rollno - " + rollno);
		System.out.println("Name - " + name);
		System.out.println("Marks - " + marks);
	}

}

public class Program02 {

	public static void main(String[] args) {
		Student[] arr = new Student[5];
		arr[0] = new Student(1, "Anil", 50);
		arr[1] = new Student(2, "Mukesh", 55);
		arr[2] = new Student(3, "Ramesh", 60);
		arr[3] = new Student(4, "Suresh", 65);
		arr[4] = new Student(5, "Ram", 70);

		for (int i = 0; i < arr.length; i++) {
			arr[i].displayStudent();
			System.out.println("----------------------");
		}

		System.out.println("Using for-each->");
		for (Student s : arr) {
			s.displayStudent();
			System.out.println("----------------------");
		}

	}

}
