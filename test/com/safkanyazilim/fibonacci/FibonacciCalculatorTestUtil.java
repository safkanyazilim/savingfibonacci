package com.safkanyazilim.fibonacci;

import static org.junit.Assert.assertEquals;


public class FibonacciCalculatorTestUtil {
	private static final int[] fibonacciNumbers = { 
		0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
		55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 
		6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 
		832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 
		102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903
	};
			

	public static void testFibonacciCalculator(FibonacciCalculator fibonacciCalculator) {
		for (int i = 0; i < fibonacciNumbers.length; i++) {
			int fibonacciNumber = fibonacciCalculator.fibonacciNumber(i);
			assertEquals("F(" + i + ") = " + fibonacciNumbers[i] + ", not " + fibonacciNumber,
			            fibonacciNumbers[i], fibonacciNumber);
		}
		
		
	}
	
	public static double totalTimeInSecondsToCalculateAllIntegerFibinacciNumbers(FibonacciCalculator fibonacciCalculator, int repetitions) {
		
		long start = System.currentTimeMillis();
		
		int executions = 0;
		int sum = 0;
		
		for (int k = 0; k < repetitions; k++) {
			for (int i = 0; i < fibonacciNumbers.length; i++) {
				sum +=  fibonacciCalculator.fibonacciNumber(i);
				executions++;
			}
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("executions:" + executions);
		System.out.println("sum: " + sum);
		
		return (end - start)/1000.0;
		
	}
	

	
}
