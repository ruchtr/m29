package org.tnsif.generics;

import java.util.List;
import java.util.ArrayList;

public class GenericsAdvantageExample {

	public static void main(String[] args) {
		//1.Type-safety
		List<Integer> list = new ArrayList();
		list.add(11);
		list.add(23);
		//list.add(23.5)
		System.out.println(list);
		
		//2.Before type-casting is allowed
		ArrayList arr1 = new ArrayList();
		arr1.add("St.John COllege");
		System.out.println(arr1);
		String str =(String)arr1.get(0);
		System.out.println(str);
		
		//3.
		ArrayList<String> arr2 = new ArrayList();
		arr2.add("St.John COllege");
		System.out.println(arr1);
		String str1 = arr2.get(0);
		System.out.println(str1);
	}

}
