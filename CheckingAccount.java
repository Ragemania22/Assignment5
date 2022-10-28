
public class CheckingAccount extends BankAccount{

	double insufficientFundsFee;
	
	public CheckingAccount (String owner, double balance) {
		super(owner, balance);
	}
	
	void processCheck(double checkAmount) {
		this.balance = this.balance + checkAmount;
	}
	
	void setInsufficientFundsFee(double insufficientFundsFee) {
		this.setInsufficientFundsFee(insufficientFundsFee);
	}
	
	void insufficientFundsFee(double insufficientFundsFee) {
		this.insufficientFundsFee = insufficientFundsFee;
	}
	
	public double getInsufficientFundsFee() {
		return insufficientFundsFee;
	}
	
	
	void withdrawal(double amount) {
		if(balance <= 0) {
			this.balance = this.balance -  getInsufficientFundsFee();
			System.out.println("Insufficient balance cannont be withdrawn: ");
		}else {
			super.withdrawal(amount);
			System.out.println("Amount has been deducted from balance: " + amount + "\nRemaining balance: " + balance);
		}
	}
	void accountStatement() {
		System.out.println("The insufficient Funds Fee is: " + getInsufficientFundsFee());
	}
}
