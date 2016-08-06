package com.safkanyazilim.fibonacci;

public class Main {

	public static void main(String[] args) {
		FibonacciCalculator fibonacciCalculator = new IterativeFibonacciCalculator();
		
		for (int i = 0; i < 100; i++) {
			System.out.print(fibonacciCalculator.fibonacciNumber(i) + ", ");
		}
		
		
	}

}
