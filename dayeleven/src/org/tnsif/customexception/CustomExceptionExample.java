package org.tnsif.customexception;
import java.util.Scanner;
public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = sc.nextLine();
		String password = sc.nextLine();
		try
		{
			if(id.equals("ruchitare2001@gmail.com")&& password.equals("1234"));
			{
				System.out.println("login sucessful");
			}
			else
			{
				throw new LoginCredential("Invalid Credentials");
			}
		}
		
		//handaling using ud exception
		catch(LoginCredential e)
		{
			System.out.println("Exception handle "+e);
		}
		
	}

}
