//program to demonstrate on object class
package org.tnsif.objectclassdemo;

class Sample{
	
}

class Demo
{
	//constructor
	Demo()
	{
		System.out.println("Inside Constructor");
	}
	protected void finalize()
	{
		System.out.println("In Finalize Method");
	}
}


public class ObjectClassDemo {

	public static void main(String[] args) {
		Sample s = new Sample();
		System.out.println(s.getClass());
		System.out.println(s.hashCode());
		
		Demo d = new Demo();
		System.out.println(d.getClass());
		System.out.println(s.hashCode());
		
		/*the object is used when you want to refer any object 
		 * data-type you dont know*/
		Object obj = new Object();
		System.out.println(obj.getClass());
		
	}

}
