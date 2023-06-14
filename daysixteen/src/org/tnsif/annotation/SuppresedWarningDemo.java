package org.tnsif.annotation;
import java.util.Set;
import java.util.TreeSet;
public class SuppresedWarningDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s = new TreeSet();
		s.add(12);
		s.add(34);
		s.add("sandhya");
		System.out.println(s);

	}

}
