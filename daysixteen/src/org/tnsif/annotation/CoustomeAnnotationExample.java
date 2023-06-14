package org.tnsif.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

//Custom Annotation need interface
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Custom
{
	String print();
	float percentage();
}

class ImplementableClass
{
	@Custom(print="Hello World",percentage=99.6f)
	public void display()
	{
		System.out.println("Hurrrah!Its's working almost!");
	}
}
public class CoustomeAnnotationExample {

	public static void main(String[] args) throws Exception, SecurityException {
		ImplementableClass imp = new ImplementableClass();
		imp.display();
		Method m=imp.getClass().getMethod("display");
		Custom obj = m.getAnnotation(Custom.class);
		System.out.println(obj.print());
		System.out.println(obj.percentage());
	}

}
