package com.safkanyazilim.fibonacci;

public class FloatingPointFibonacciCalculator implements FibonacciCalculator {
	private static double phi = 1.6180339887498948482;
	private static double root5 = 2.2360679774997896964;
	
	@Override
	public int fibonacciNumber(int n) {
		if (n <= 0) {
			return 0;
		} else {
			return (int)(Math.pow(phi, n)/root5 + 0.5);
		}
	}

}
