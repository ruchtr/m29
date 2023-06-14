package org.tnsif.enumeration;

public class EmployeeEnumeration {
	
	enum empType
	{
		CONTRACT,PERMANENT,TEMPORARY
	}
	static void print(empType a)
	{
		if(a==empType.CONTRACT)
		{
			System.out.println("You are on contract based");
		}
		else if(a==empType.PERMANENT)
		{
			System.out.println("Permanent type");
		}
		else
		{
			System.out.println("Temporary type");
		}
	}
	
	public static void main(String[] args) {
		empType a = empType.CONTRACT;
		print(a);

	}

}
