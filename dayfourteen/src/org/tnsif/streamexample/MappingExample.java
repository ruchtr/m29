package org.tnsif.streamexample;
import java.util.Arrays;
import java.util.List;
class MappingExample {
	public static void main(String[] args)
	{	//using collection
		List<String>obj=Arrays.asList("Ruchi","Sandhya","Shruti");
		obj.stream().map(i->i.length()).forEach((i)->System.out.println(i+" "));
	}
	
}
