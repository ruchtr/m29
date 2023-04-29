//program on static block static method
package org.tnsif.statickeyword;

public class Customer {
	private int cutid;
	private static String campname;
	
	//static block
	static
	{
		campname = "Myntra";
	}
	
	public Customer()
	{
		System.out.println("default constructore");
		cutid++;
	}

	@Override
	public String toString() {
		return "Customer [cutid=" + cutid + "]";
	}
	
	static void display()
	{
		System.out.println("Comapany name: "+campname);
	}
}
