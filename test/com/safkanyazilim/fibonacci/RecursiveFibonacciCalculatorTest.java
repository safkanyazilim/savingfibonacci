package com.safkanyazilim.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class RecursiveFibonacciCalculatorTest {

	private RecursiveFibonacciCalculator recursiveFibonacciCalculator;
	
	@Before
	public final void setUp() {
		this.recursiveFibonacciCalculator = new RecursiveFibonacciCalculator();
	}
	
	@Test
	public final void testFibonacciNumber() {
		FibonacciCalculatorTestUtil.testFibonacciCalculator(this.recursiveFibonacciCalculator);
	}

}
