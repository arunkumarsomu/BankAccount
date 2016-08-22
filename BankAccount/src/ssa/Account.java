package ssa;

import java.util.HashMap;
import java.text.NumberFormat;

public class Account {

	private final int accountId;
	private String desc;
	private String type;
	private double balance;
	private String firstName;
	private String lastName;
	private int transactId;
	HashMap<Integer, String> TransLog = new HashMap<Integer, String>(); 
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	
	public Account(int actid){
		this.accountId = actid;
		this.balance = 0.0;
		this.transactId = 0;
				
	}
	public void setAccountDetails(int actId, String type1, double bal, String firstNam, String lastNam ){
//		this.accountId = actId;
		this.type = type1;
		this.balance = bal;
		this.firstName = firstNam;
		this.lastName = lastNam;
		if ( type1 == "Savings" ){
			this.desc = "My personal savings account";
		}
		if ( type1 == "Checkings" ){
			this.desc = "My personal checkings account";
		}
		
	}
	
	public int getAccountId(){
		return this.accountId;
	}
	public String getType(){
		return this.type;
	}
	public double getBalance(){
		return this.balance;
	}
	public String getName(){
		return (this.firstName+this.lastName);
	}
	
	public boolean withDraw(int acct, double amt){
		this.transactId++;
		String val = "Account :" + this.accountId + " Transaction :"+this.transactId;
		
		System.out.println(" Transaction Id for "+ this.type+" account "+ this.accountId+" is : "+this.transactId);
		
		if (balance >= amt){
			balance -= amt;
			System.out.println("Withdraw successfull for amount : "+fmt.format(amt));
		    val +=  " Withdraw successfull for amount : "+fmt.format(amt);
		    TransLog.put(this.transactId, val);
			return true;
		}
		else {
			System.out.println("Withdraw failed for amount : "+fmt.format(amt));
			System.out.println("Insufficient funds!!!, balance is: "+fmt.format(balance));
			val +=  " Withdraw failed for amount : "+fmt.format(amt);
			TransLog.put(this.transactId, val);
			return false;
		}
				
	}
	
	public void depositAmount(int acct, double amt){
		this.transactId++;
		String val = "Account :" + this.accountId + " Transaction :"+this.transactId;
		val +=  " Deposit successfull for amount : "+fmt.format(amt);
		TransLog.put(this.transactId, val);
		
		System.out.println(" Transaction Id for "+ this.type+" account "+ this.accountId+" is : "+this.transactId);
		System.out.println(" Balance before deposit is : "+fmt.format(this.balance));
		System.out.println(" Deposit amount is : "+fmt.format(amt));
		this.balance += amt;
		System.out.println(" Balance after deposit is : "+fmt.format(this.balance));
		
			
	}
	
	public void CheckingsToSavings(int checkingAcct, int savingAcct, double amt){
		if (balance >= amt){
			balance -= amt;
			System.out.println("Withdraw successfull for amount : "+fmt.format(amt));
		}
		else if(balance < amt){
			System.out.println("Withdraw failed for amount : "+fmt.format(amt));
			System.out.println("Insufficient funds!!!, balance is: "+fmt.format(this.balance));
		}
	}
	
	public void displayAccount(){
		System.out.println(" *************************************************************");
		System.out.printf("  Account number  ");
		System.out.printf(" \t Name      ");
		System.out.printf(" \t Acct Type    ");
		System.out.printf(" \t Account Balance is   ");
		System.out.println(" ");
		System.out.printf("    "+this.accountId+"                 "+this.firstName+" "+this.lastName);
		System.out.printf("\t "+ this.type);
		System.out.printf("\t\t"+ fmt.format(this.balance));
		System.out.println(" ");
		
	}
	
	public void displayTranslog(){
		int size = TransLog.size();
		for (int i=1;i<size+1;i++){
			System.out.println(TransLog.get(i));
		}
				
	}
	
}
