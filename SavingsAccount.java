
public class SavingsAccount extends BankAccount{
	
	double annualInterestRate;

	public SavingsAccount (String owner, double balance) {
		super(owner, balance);
	}
	
	void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public double depositMonthlyInterest() {
		double intRate = (this.balance * annualInterestRate/10);
		this.balance = this.balance + intRate;
		return intRate;
	}
	
	void withdrawal(double amount) {
		this.balance = this.balance - amount;
	}
}
