//program to ddemonstrate this key word
package org.tnsif.thiskeyword;

public class thisKeywordExample {
	private int cvvno;
	private long atmNo;
	
	//parameterised constructor
	public thisKeywordExample(int cvvno, long atmNo) {
		
		this.cvvno = cvvno;
		this.atmNo = atmNo;
	}
	
	public void print()
	{
		System.out.println("CVV ni is: "+cvvno+" "
				+"Atm Card No is: "+atmNo);
		

	}
	
	
}
