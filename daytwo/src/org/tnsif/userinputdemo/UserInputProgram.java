package org.tnsif.userinputdemo;
import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float salary = s.nextFloat();
		
		
		System.out.println("Enter your salary: ");
		String name = s.next();
		s.nextLine();
		
		System.out.println("Enter your Name1: ");
		String name1 = s.nextLine();
		
		System.out.println("Enter your Character: ");
		char ch = s.next().charAt(0);
		
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name is: "+name1);
		System.out.println("Character is: "+ch);
		
		s.close();
		
	}

}
