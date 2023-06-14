/*Program to demonstrate on different annotation
 * which is used in Junit5*/
package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
@TestInstance(Lifecycle.PER_CLASS)
class JunitAnnotationDemo {

	@Test
	void display() {
		System.out.println("First Junit5 test case");
	}
	
	@Test
	/*Below annotation is used after
	 * all the test method*/
	@AfterEach
	void accept() {
		System.out.println("Performing After Each Test");
	}
	
	
	@Test
	/*Below annotation is used before
	 * all the test method*/
	@BeforeAll
	void print() {
		System.out.println("Performing First Test");
	}
}
