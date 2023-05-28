//programe to demonstrate on arithematic exception
package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class ArithematicExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x and y: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		try {
			System.out.println(x/y);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Always exceuted");
		}
	}

}
