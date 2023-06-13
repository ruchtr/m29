//program to demonstrate on generic method
package org.tnsif.generics;

class GenericMethod
{
	//generic method
	//E types of elements
	public <E> void print(E[] arr1)
	{
		for(E itr:arr1)
		{
			System.out.println(itr+" ");
		}
		System.out.println();
	}
}


//driver class
public class GenericMethodExample {

	public static void main(String[] args) {
		GenericMethod g = new GenericMethod();
		Integer[] arr1= {11,34,67};
		Character[] arr2 = {'f','H','R'};
		System.out.println("Integer array: ");
		g.print(arr1);
		System.out.println("Character array: ");
		g.print(arr2);

	}

}
