//program to demonstrate on multiple catch block.
package org.tnsif.exceptiondemo;

public class miltiplecatchdemo {

	public static void main(String[] args) {
		int arr[] = new int[] {11,22,33};
		System.out.println("array is: ");
		try {
		System.out.println(arr[3]);
		}
		
		//we can use multiple catch block
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}*/
		
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
