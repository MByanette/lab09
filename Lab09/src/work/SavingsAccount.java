package work;

abstract class SavingsAccount {
	int balance;
	int numDeposit;
	int numWithdrawl;
	double annualInterestRate;
	double monthlyServiceCharges;
	public SavingsAccount(int balance,double annualInterestRate) {
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
