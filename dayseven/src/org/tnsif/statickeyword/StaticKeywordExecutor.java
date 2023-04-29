package org.tnsif.statickeyword;

public class StaticKeywordExecutor {
	public static void main(String[] args)
	//without creating object variable call
	{
		System.out.println(Employee.companyname);
		Employee e1 = new Employee(12,"sak");
		System.out.println(e1);
		
		Employee e2 = new Employee(10,"Ru");
		System.out.println(e2);
		
		Customer.display();
		Customer c = new Customer();
		System.out.println(c);
		
	}
}
