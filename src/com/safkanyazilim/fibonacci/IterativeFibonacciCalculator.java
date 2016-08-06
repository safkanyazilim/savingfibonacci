package com.safkanyazilim.fibonacci;

public class IterativeFibonacciCalculator implements FibonacciCalculator {

	@Override
	public int fibonacciNumber(int n) {
		if (n <= 0) {
			return 0;
		} else if (n == 1 || n == 2) {
			return 1;
		} else {
			int a = 1;
			int b = 1;
			
			for (int i = 2; i < n; i++) {
				a = a + b;
				b = a - b;
			}
			
			return a;
		}
		
	}

}
