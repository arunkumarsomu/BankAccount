package ssa;

import java.util.HashMap;



public class Mainline {

	
	public static void main(String[]  args){
		boolean withdrawFlag;
		HashMap<Integer, String> TransLog = new HashMap<Integer, String>(); 
		Account checkings = new Account(100);
		Account savings = new Account(200);
		
		checkings.setAccountDetails(100, "Checkings", 500.00, "John", "Smith");
		checkings.displayAccount();
				
		checkings.depositAmount(100, 200.00);
		checkings.displayAccount();
		
		checkings.withDraw(100, 600.00);
		checkings.displayAccount();
		
		checkings.depositAmount(100, 100.00);
		checkings.displayAccount();
		
		checkings.withDraw(100, 300.00);
		checkings.displayAccount();
		
		checkings.withDraw(100, 200.00);
		checkings.displayAccount();
		
		savings.setAccountDetails(200, "Savings", 1000.00, "John", "Smith");
		savings.displayAccount();
		
		savings.withDraw(200, 750.00);
		savings.displayAccount();
		
		savings.withDraw(200, 250.00);
		savings.displayAccount();
		
		savings.depositAmount(200, 200.00);
		savings.displayAccount();
		
		// This is to do transfer 
		withdrawFlag = savings.withDraw(200, 100.00);
		savings.displayAccount();
		
		if (withdrawFlag){
			System.out.println("Initiating transfer of $100 from Savings to Checkings" );
			checkings.depositAmount(100, 100.00);
			checkings.displayAccount();
			System.out.println("Transfered $100 from Savings to Checkings" );
		}else {
			System.out.println("Transfer failed, Insufficient fund" );
		}
		
		System.out.println("All transactions for Checkings ");
		checkings.displayTranslog();
		
		System.out.println("All transactions for Savings ");
		savings.displayTranslog();
		
	}
}
