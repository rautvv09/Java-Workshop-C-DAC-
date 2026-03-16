import java.util.Scanner;

class Time {
// variable declared inside the class are called as fields
	int hr;
	int min;

	void accept() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hrs - ");
		hr = sc.nextInt();
		System.out.println("Enter the mins - ");
		min = sc.nextInt();
	}

	// functions declared inside the class are called as methods
	void display() {
		System.out.println("Time = " + hr + " : " + min);
	}
}

public class Program {

	public static void main(String[] args) {
		Time t1 = new Time();
		t1.accept();
		t1.display();
	}

	public static void main1(String[] args) {
		// variable of a class
		Time t1; // Reference
		// reference stores the address of an object

		t1 = new Time(); // object
		t1.display();
		t1.hr = 12;
		t1.min = 13;
		t1.display();
	}

}
