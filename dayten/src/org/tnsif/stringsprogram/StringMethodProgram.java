package org.tnsif.stringsprogram;
import java.util.Scanner;

public class StringMethodProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Dhoni";
		Scanner s = new Scanner(System.in);
		String str2 =  new String(s.nextLine());
		
		if(str1.equals(str2))
		{
			System.out.println("Both are equals");
		}
		else
		{
			System.out.println("Not equals");
		}

	}

}
