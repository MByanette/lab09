package work;

abstract class BankAccount extends SavingsAccount{
	int balance;
	int numDeposit;
	int numWithdrawl;
	double annualInterestRate;
	double monthlyServiceCharges;
	
	
	
	
	public BankAccount(int balance,double annualInterestRate) {
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}
	public void deposit(int amount) {
		balance += amount;
		numDeposit++;
	}
	public void withdraw(int amount) {
		balance -= amount;
		numWithdrawl++;
	}
	
	public void calcInterest(int monthlyServiceCharges) {
		int monthlyInterestRate = (annualInterestRate/12);
		int monthlyInterest = balance*monthlyInterestRate;
		balance += monthlyInterest;
	}
	
	public void monthlyProcess (int balance) {
		balance -= monthlySericeCharges;
		calcInterest();
		numWithdrawls = 0;
		numDeposits = 0;
		monthlyServiceCharges = 0;
		
		
	}
}
//	public calcInterest() {
//		int monthlyIntrestRate = yearlyIntrestRate/12;
//		int monthlyIntrest = balance * monthlyIntrestRate;
//		balance += monthlyIntrest
//	}
//	public void monthlyProcess() {
//        balance -= monthlyServiceCharges;
//        calcInterest();
//        numWithdrawl = 0;
//        numDeposit = 0;
//        monthlyServiceCharges = 0;
//    }
//		
//
//}
