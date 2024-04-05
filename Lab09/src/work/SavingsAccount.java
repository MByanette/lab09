package work;

class SavingsAccount extends BankAccount {
	int balance;
	double annualInterestRate;
	int amount;
	boolean status;
	
	if(balance =< 25) {
		status = false;
		System.out.println("Account is in violations of terms of Serice. Account is Innactive.");
	}

	public void BankAccount(int balance, double annualInterestRate) {
	  //   status = true; 
	    }

	    @Override
	    public void withdraw(int amount) {
	        if (status = true) {
	            this.withdraw(amount);
	            if (balance < 25)
	                status = false;
	        }
	    }

	    @Override
	    public void deposit(int amount) {
	        if (status = false) {
	        	this.deposit(amount);
	        	if(balance => 25)
	            status = true;
	        } else {
	        	this.deposit(amount);
	        	
	        }
	    }
	    
	    public void monthlyProcess(double monthlyServiceCharges) {
	    	if (numwithdrawls > 4) {
	    		this.monthlyServiceCharge += 1.0;
	    		if(balance<25) {
	    			status = false;
	    		}
	    	}
	    }
	    
	    
	    @Override
//	    public void monthlyServiceCharges() {
//	        if (numWithdrawl > 4) {
//	            monthlyServiceCharges += (numWithdrawl - 4);
//	            balance -= (numWithdrawl - 4);
//	            if (balance < 25)
//	                status = false;
//	        }
//	        this.monthlyServiceCharges();
//	    }

	}
