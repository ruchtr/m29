//program on interface
package org.tnsif.interfacedemo;
public interface ATMmachine {
	//by default all varible inside an intface  public static final 
	//so here is amount is final type  valure and it initize
	//int amount;
	int amountwith=10000 ;
	int amountdepo=2000;
	
//by default all the method inside an interface are public abstract
	void withdraw();
	void deposit();
}