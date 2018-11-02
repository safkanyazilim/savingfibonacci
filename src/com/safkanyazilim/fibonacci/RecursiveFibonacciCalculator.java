package com.safkanyazilim.fibonacci;

public class RecursiveFibonacciCalculator implements FibonacciCalculator {
	
	@Override
	public int fibonacciNumber(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
		}
	}

}
