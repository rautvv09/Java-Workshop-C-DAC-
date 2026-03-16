
class BankAccount {
	int accno; // field (cpp-Datamemebrs)
	String name;
	double balance;

	// methods (cpp-member functions)
	void deposit(double amount) {

	}

	void withdraw(double amount) {

	}
}

class Time {
	int hr;
	int min;
}

public class Program01 {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount();

		BankAccount a2 = new BankAccount();
		a2.accno = 1002;
		a2.name = "anil";
		a2.balance = 10000;

		BankAccount a3 = new BankAccount();
		a3.accno = 1003;
		a3.name = "Mukesh";
		a3.balance = 20000;

		Time t1 = new Time();
		t1.hr = 10;
		t1.min = 20;

		Time t2 = new Time();
		t1.hr = 12;
		t1.min = 20;

		Time t3 = new Time();
		t1.hr = 10;
		t1.min = 30;

	}

}
