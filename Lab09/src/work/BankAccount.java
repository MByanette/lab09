package work;

class SavingsAccount extends BankAccount {
	int balance;
	double annualInterestRate;
	int amount;
	boolean status;

	public void BankAccount(int balance, double annualInterestRate) {
	     status = true; 
	    }

	    @Override
	    public void withdraw(int amount) {
	        if (status) {
	            this.withdraw(amount);
	            if (balance < 25)
	                status = false;
	        }
	    }

	    @Override
	    public void deposit(int amount) {
	        if (status) {
	        	this.deposit(amount);
	        	if(balance > 25)
	            status = true;
	        }
	    }

	    @Override
	    public void monthlyServiceCharges() {
	        if (numWithdrawl > 4) {
	            monthlyServiceCharges += (numWithdrawl - 4);
	            balance -= (numWithdrawl - 4);
	            if (balance < 25)
	                status = false;
	        }
	        this.monthlyServiceCharges();
	    }

	}
