package com.dkte;

import java.util.Scanner;
class Student3{
	String name;
	int rollno;
	double marks;
	
	public Student3() {
		
	}
	
	public Student3(String name,int rollno,double marks) {
		this.name=name;
		this.rollno=rollno;
		this.marks=marks;	
	}
	

	public void displayStudent() {
		System.out.println("----------------------------------");
		System.out.println("Student Name:"+name);
		System.out.println("Student Roll No:"+rollno);
		System.out.println("Student Marks:"+marks);
		System.out.println("----------------------------------");
	}
	
	public void acceptStudent(Scanner sc) {
	
		System.out.println("Enter Student Name:");
		name=sc.next();
		
		System.out.println("Enter Student Roll No:");
	     rollno=sc.nextInt();
		
		System.out.println("Enter Student Marks:");
		marks=sc.nextDouble();

	}
}
public class program04 {

	public static int menu(Scanner sc) {
		System.out.println("--------------------");
		System.out.println("0. EXIT");
		System.out.println("1. Add Student");
		System.out.println("2. Display Student");
		System.out.println("3. Find Student");
		System.out.print("Enter your choice - ");
		int choice = sc.nextInt();
		System.out.println("--------------------");
		return choice;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int choice;
		int n=1;
		Student3[] stu=new Student3[n];
		
		while((choice=menu(sc))!=0){
			 
			switch(choice) {
			case 1: System.out.println("Enter The Number Of Student To Add:\n");
					 n=sc.nextInt();
					
				    //stu=new Student3[n];
				    
				    for(int i=0;i<stu.length;i++) {
				    	    stu[i]=new Student3();	
				    		stu[i].acceptStudent(sc);	
				    	}
				    break;
						
				
			case 2:System.out.println("Displaying The Student Information:\n");
		               for(int i=0;i<stu.length;i++) {
		    	        if(stu[i]!=null) {
		    		           stu[i].displayStudent();	
		    	                 }
		                  } 
		               break;
				
			case 3:System.out.println("Enter The Student Name To Find:\n");
					String snm=sc.nextLine();
					
                        for(int i=0;i<stu.length;i++) {
 	                             if(stu[i]!=null && stu[i].name==snm) {
 		                               stu[i].displayStudent();	
 	                         }
                        }
                        break;
				
				
			default:System.out.println("Enter The Valid Choice...!!!");
				    break;
			}
			
		}
	}

}
