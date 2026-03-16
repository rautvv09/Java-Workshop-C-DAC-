package Assigment_01;
import java.util.*;

public class program02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The First Double Number:");
		if((!sc.hasNextDouble())||sc.hasNextInt()) {
			System.out.println("Error: First Number Is Not A Double...!!");
			return;
		}
		double num1=sc.nextDouble();
		
		System.out.println("Enter The Second Double Number:");
		if((!sc.hasNextDouble())||sc.hasNextInt()) {
			System.out.println("Error: Second Number Is Not A Double...!!");
			return;
			}
		double num2=sc.nextDouble();

		
		double avg=(num1+num2)/2;
		System.out.println("Average Is:"+avg);
		
			sc.close();

	}

}
