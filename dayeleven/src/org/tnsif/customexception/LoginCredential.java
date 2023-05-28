package org.tnsif.customexception;

public class LoginCredential extends Exception {
	
	private String str1;
	public LoginCredential(String str1)
	{
		super();
		this.str1 = str1;
	}
	
	@Override
	
		public String toString()
		{
			return "LoginCredential[str1 = "+str1 +"]";
		}
	
	
		



}
