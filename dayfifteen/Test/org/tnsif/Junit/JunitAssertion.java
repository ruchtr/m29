/*Program to demonstrate on Junit assertion methods*/
package org.tnsif.Junit;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class JunitAssertion {
	@Test
	void test()
	{
		//Fails if the expression is not true.
		assertTrue(10>5);
	}
	
	@Test
	void display()
	{
		//Fails if the expression is not false.
		assertFalse(10>5);
	}
	
	@Test
	void accept()
	{
		//Fails if the expression is not null.
		assertNull(null);
	}

}
