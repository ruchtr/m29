package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
class FristJunitTestCase {
	
	/*@Test annotation is used to perform the testing
	 * on the given method*/
	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@DisplayName("SimpleTesting")
	void display() {
		System.out.println("First Junit5 test case");
	}

}
