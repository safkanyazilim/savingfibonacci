package com.safkanyazilim.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class FloatingPointFibonacciCalculatorTest {

	private FloatingPointFibonacciCalculator floatingPointFibonacciCalculator;
	
	@Before
	public final void setUp() {
		this.floatingPointFibonacciCalculator = new FloatingPointFibonacciCalculator();
	}
	
	@Test
	public final void testFibonacciNumber() {
		FibonacciCalculatorTestUtil.testFibonacciCalculator(this.floatingPointFibonacciCalculator);
	}

}
