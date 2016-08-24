package ssa;

public class Savings extends Account{
	private double interestRate;
	double depositInterest;

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate / 12;
	}
	
	public Savings(){
		super();
		interestRate = 0.015;
		this.setInterestRate(interestRate);
	}
	
	public Savings(int actid, String desc){
		super(actid, desc);
		interestRate = 0.015;
		this.setInterestRate(interestRate);
	}
	
	public Savings( String desc){
		super(desc);
		interestRate = 0.015;
		this.setInterestRate(interestRate);
	}
	public void calcDepositInterest(int months){
		double amount;
		amount = this.getBalance();
		amount = amount * this.getInterestRate() * months ;
		this.deposit(amount);
			
	}

	}
