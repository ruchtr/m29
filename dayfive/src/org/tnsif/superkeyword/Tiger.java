package org.tnsif.superkeyword;

public class Tiger extends Animal {
	private String animalType = "tiger-wild";
	private int noOfLegs=4;
	
	public void display()
	{
		super.display();
		
		
	}

	@Override
	public String toString() {
		return "Tiger [animalType=" + animalType + ", noOfLegs=" + noOfLegs + "]";
	}
	
	
}
