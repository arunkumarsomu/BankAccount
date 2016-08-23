package ssa;

import java.util.HashMap;

public class Mainline {

	
	public static void main(String[]  args){
		boolean withdrawFlag;
		HashMap<Integer, String> TransLog = new HashMap<Integer, String>(); 
		
		Account checkings = new Account("My Checkings act");
		Account savings = new Account("My Savings act");
		String output;
//		checkings.setAccountDetails(100, "Checkings", 500.00, "John", "Smith");
		
//		checkings.balance = 800.00;
//		checkings.displayAccount();
				
		checkings.deposit(1100.00);
//		checkings.displayAccount();
		
		checkings.withdraw(699.99);
//		checkings.displayAccount();
		
		checkings.deposit(149.99);
//		checkings.displayAccount();
		
		checkings.withdraw(950.00);
//		checkings.displayAccount();
		
		checkings.withdraw(200.00);
//		checkings.displayAccount();
		
//		savings.setAccountDetails(200, "Savings", 1000.00, "John", "Smith");
//		savings.displayAccount();
		savings.deposit(1000.00);
		
		savings.withdraw(750.00);
//		savings.displayAccount();
		
		savings.withdraw(250.00);
//		savings.displayAccount();
		
		savings.deposit(200.00);
//		savings.displayAccount();
		
		// This is to do transfer 

		
		checkings.transferFrom(savings, 100);
//		checkings.displayAccount();
//		savings.displayAccount();
		output = checkings.print();
		System.out.println("Output : "+ output);
		output = savings.print();
		System.out.println("Output : "+ output);
		
		System.out.println("All transactions for Checkings ");
		checkings.displayTranslog();
		
		System.out.println("All transactions for Savings ");
		savings.displayTranslog();
		
	}
}
