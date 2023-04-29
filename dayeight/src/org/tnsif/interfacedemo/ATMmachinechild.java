package org.tnsif.interfacedemo;

public class ATMmachinechild implements ATMmachine {
	@Override
	public void withdraw()
	{
		System.out.println("Withdraw amount: "+amountwith);
	}
	
	@Override
	public void deposit()
	{
		System.out.println("deposite amount: "+amountdepo);
	}
	
	
}
