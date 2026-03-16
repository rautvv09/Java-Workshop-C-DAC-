package com.dkte.test;

import java.util.Scanner;

public class Program01 {

    public static int menu(Scanner sc) {
        System.out.println("\n------------------------------------------------");
        System.out.println("   1: Add Employee");
        System.out.println("   2: Display All Employees");
        System.out.println("   3: Search Employee by ID");
        System.out.println("   4: Display Employees Joined in Given Year");
        System.out.println("   5: Find Employee with Maximum Salary");
        System.out.println("   6: Find Employee with Minimum Salary");
        System.out.println("   7: Exit the Application");
        System.out.println("------------------------------------------------");
        System.out.print("Enter Your Choice: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Number of Employees: ");
        int n = sc.nextInt();

        Employee[] e = new Employee[n];
        int Choice;

        while ((Choice = menu(sc)) != 7) {
            switch (Choice) {
                
            case 1:  System.out.println("\nAdd Employee:");
		                    for (int i = 0; i < e.length; i++) {
		                        if (e[i] == null) {
		                            e[i] = new Employee();
		                            e[i].acceptEmp(sc);
		                        }
		                    }
		                    break;

                
	        case 2:   System.out.println("\nDisplaying All Employees:");
	                    for (Employee emp : e) {
	                        if (emp != null) {
	                            System.out.println(emp);
	                            System.out.println("-----------------------------------");
	                        }
	                    }
	                    break;

                case 3:
                    System.out.println("\nSearch Employee by ID:");
                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    boolean found = false;

                    for (Employee emp : e) {
                        if (emp != null && emp.getEmpid() == id) {
                            System.out.println(emp);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Employee with ID " + id + " not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nDisplay Employees Joined in Given Year:");
                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();
                    boolean anyFound = false;

                    for (Employee emp : e) {
                        if (emp != null && emp.getDoj().getYear() == year) {
                            System.out.println(emp);
                            anyFound = true;
                        }
                    }
                    if (!anyFound) {
                        System.out.println("No employees joined in year " + year + ".");
                    }
                    break;

                case 5:
                    System.out.println("\nEmployee with Maximum Salary:");
                    Employee maxEmp = null;
                    for (Employee emp : e) {
                        if (emp != null) {
                            if (maxEmp == null || emp.getSalary() > maxEmp.getSalary()) {
                                maxEmp = emp;
                            }
                        }
                    }
                    if (maxEmp != null) {
                        System.out.println(maxEmp);
                    } else {
                        System.out.println("No employees available.");
                    }
                    break;

                case 6:
                    System.out.println("\nEmployee with Minimum Salary:");
                    Employee minEmp = null;
                    for (Employee emp : e) {
                        if (emp != null) {
                            if (minEmp == null || emp.getSalary() < minEmp.getSalary()) {
                                minEmp = emp;
                            }
                        }
                    }
                    if (minEmp != null) {
                        System.out.println(minEmp);
                    } else {
                        System.out.println("No employees available.");
                    }
                    break;

                default:
                    System.out.println("Enter a valid choice!");
            }
        }

        System.out.println("\nExiting from Program... Goodbye!");
        sc.close();
    }
}
