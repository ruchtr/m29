package org.tnsif.annotation;

class Car
{
	public void speed(int speed)
	{
		System.out.println("Speed is: "+speed+"km/hr");
	}
}
class Mercedes extends Car
{	/*Below Annotation ensures that child class method is
inheriting the properties of the paren class.*/
	@Override
	public void speed(int speed)
	{
		System.out.println("Speed is: "+speed+"km/hr");
	}
	
}

public class OverrideAnnotationExample {

	public static void main(String[] args) {
		
		Mercedes ms = new Mercedes();
		ms.speed(76);

	}

}
