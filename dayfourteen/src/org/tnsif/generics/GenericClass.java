//program to demonstrate on generic class
package org.tnsif.generics;

public class GenericClass<T> {
	//T is a class and x is the object of any type.
	T x;
	void print(T x)
	{
		this.x=x;
	}
	T accept()
	{
		return x;
	}
}
//driver class
class GenericClassExample
{
	
	public static void main(String[] args) {
		GenericClass<Character> obj = new GenericClass<>();
		obj.print('S');
		System.out.println(obj.accept());

	}

}
