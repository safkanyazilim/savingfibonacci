package com.safkanyazilim.fibonacci;

public class Main {

	public static void main(String[] args) {
		FibonacciCalculator fibonacciCalculator = new FloatingPointFibonacciCalculator();
		
		double totalTimeSeconds = FibonacciCalculatorTestUtil.totalTimeInSecondsToCalculateAllIntegerFibinacciNumbers(fibonacciCalculator, 10_000_000);
		
		System.out.println("Total time in seconds: " + totalTimeSeconds);
		
	}

}
