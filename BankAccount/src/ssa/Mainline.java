package ssa;

import java.util.HashMap;
import java.util.*;

public class Mainline {

	
	public static void main(String[]  args){

		 
		Savings savings3 = new Savings("Savings 3");
		savings3.setDescription("Savings");
		savings3.deposit(500.00); // bal 300
		savings3.calcDepositInterest(4);
	//	System.out.println(savings3.print());
		
		Checking checking1 = new Checking(101,"Checking Acct");
		checking1.deposit(1000);
		checking1.withdraw(200);
		System.out.println(checking1.print());
		checking1.withdraw(200);
		System.out.println(checking1.print());
		checking1.withdraw(200);
		System.out.println(checking1.print());

	
		


		
	}
}
