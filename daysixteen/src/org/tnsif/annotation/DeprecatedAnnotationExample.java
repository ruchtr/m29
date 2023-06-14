package org.tnsif.annotation;
public class DeprecatedAnnotationExample {
	//It allows any element no lenger to be used
	@Deprecated
	public static void print()
	{
		System.out.println("Welcome to Java Annotation");
	}
	public static void main(String[] args)
	{
		DeprecatedAnnotationExample.print();
	}
}
