/*program to demonstrate on junit assupmtion method*/
package org.tnsif.Junit;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
class JunitAssumptionDemo {

	@Test
	void test() {
		Assumptions.assumeTrue(12==12);	
	}
	@Test
	void display() {
		Assumptions.assumeFalse(12==12);	
	}

}
