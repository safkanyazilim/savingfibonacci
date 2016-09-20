package com.safkanyazilim.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class LookupFibonacciCalculatorTest {

	private LookupFibonacciCalculator lookupFibonacciCalculator;
	
	@Before
	public final void setUp() {
		this.lookupFibonacciCalculator = new LookupFibonacciCalculator();
	}
	
	@Test
	public final void testFibonacciNumber() {
		FibonacciCalculatorTestUtil.testFibonacciCalculator(this.lookupFibonacciCalculator);
	}

}
