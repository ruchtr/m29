//program to demonstrate on stream.
package org.tnsif.streamexample;

import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream <Integer>s1 = Stream.of(11,23,46,89);
		s1.forEach((i)->System.out.println(i+" "));

	}

}
