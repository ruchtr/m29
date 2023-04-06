package org.tnsif.decisionmaking;
import java.util.Scanner;

public class IfElseProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age and weight of the donar");
		int age = sc.nextInt();
		int weight = sc.nextInt();
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate the blood");
			
		}

	}

}
