
public class BankAccount {

	String owner;
	double balance;
	
	BankAccount(String owner, double balance){
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	
	void withdrawal(double amount) {
		this.balance = this.balance - amount;
	}
	
	void display() {
		System.out.println("------------------------------");
		System.out.println("Owner " + owner);
		System.out.println("Balance " + balance);
		System.out.println("------------------------------");
	}

}
