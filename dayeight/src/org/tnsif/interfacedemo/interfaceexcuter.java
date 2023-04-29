package org.tnsif.interfacedemo;

public class interfaceexcuter {

	public static void main(String[] args) {
		//we cannot instantiate any interface
		ATMmachine a1 =new ATMmachinechild();
		a1.deposit();
		a1.withdraw();
		
		ReceipeExecuter r1 =new ReceipeExecuter();
		r1.setName("C2TC program ");
		System.out.println(r1.displayname());
		
		
		NestedInterfaceEx n1 =new NestedInterfaceEx();
		n1.setStr1("sandhya");
		n1.setStr2("khamgal");
		System.out.println(n1.Concanate());

	}

}