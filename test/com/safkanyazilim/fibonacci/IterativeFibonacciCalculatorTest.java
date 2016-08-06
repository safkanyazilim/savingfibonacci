package com.safkanyazilim.fibonacci;

import org.junit.Before;
import org.junit.Test;

public class IterativeFibonacciCalculatorTest {

	private IterativeFibonacciCalculator iterativeFibonacciCalculator;
	
	@Before
	public final void setUp() {
		this.iterativeFibonacciCalculator = new IterativeFibonacciCalculator();
	}
	
	@Test
	public final void testFibonacciNumber() {
		FibonacciCalculatorTestUtil.testFibonacciCalculator(this.iterativeFibonacciCalculator);
	}

}
