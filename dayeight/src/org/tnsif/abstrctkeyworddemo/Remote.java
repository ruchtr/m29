//program on abstract class and abstract method
package org.tnsif.abstrctkeyworddemo;
public abstract class Remote {
	/*if any class declare as a abstract then 
	  that class must contain one abstract method 
	 */
	public String name;
	/*abstract class can have contain abstract 
	 and non abstract method*/
	
	abstract void functionremote();
	abstract void create();
	
	void display()
	{
		System.out.println("Cell name: "+name);
	}
	
}

//implementable class
class Remotechild extends Remote
{

	@Override
	void functionremote() {
		System.out.println("Abstract Method");
		
	}

	@Override
	void create() {
		System.out.println("Abstract method 2");
		
	}
	
}