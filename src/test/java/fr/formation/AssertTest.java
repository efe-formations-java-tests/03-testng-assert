
package fr.formation;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertEqualsNoOrder;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertThrows;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class AssertTest {

	@Test
	public void testAssertEquals() {
		List<String> l1 = Arrays.asList("A", "B", "C");
		List<String> l2 = Arrays.asList("A", "B", "C");
		assertEquals(l1, l2);

	}

	@Test
	public void testAssertNotEquals() {
		List<String> l1 = Arrays.asList("A", "C", "B");
		List<String> l2 = Arrays.asList("A", "B", "C");
		assertNotEquals(l1, l2);

	}

	@Test
	public void testAssertEqualsNoOrders() {
		List<String> l1 = Arrays.asList("A", "C", "B");
		List<String> l2 = Arrays.asList("A", "B", "C");
		assertEqualsNoOrder(l1.toArray(), l2.toArray());

	}

	@Test
	public void testThrows() {

		assertThrows(RuntimeException.class, () -> division(6, 0));

	}

	private double division(double a, double b) {
		if (b == 0)
			throw new RuntimeException();
		else
			return a / b;
	}
}
