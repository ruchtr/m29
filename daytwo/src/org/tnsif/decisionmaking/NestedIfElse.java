package org.tnsif.decisionmaking;
import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your age and weight: ");
	    int age = sc.nextInt();
	    int weight = sc.nextInt();
	    
	    if(age>18)
	    {
	    	if(weight>50)
	    	{
	    		System.out.println("You are eligible to donate blood");
	    	}
	    	else
	    	{
	    		System.out.println("You are not eleigble to donate blood");
	    	}
	    }
	    else
	    {
	    	System.out.println("You are under 18");
	    }
	    
	}

}
