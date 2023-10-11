package com.gradescope.hw4;

public class Hw4Pr3Recursion {

	/**
	 * Counts the number of divisible integers
	 * 
	 * @param n - a non-negative integer indicating the range to check
	 * @param k - a positive integer indicating the divisor
	 * @return the number of integers between 0 and n (inclusive) that are divisible
	 *         by k
	 */
	public static int countDivisibleBy(int n, int k) {
		if(n == 0) return 1;
		else if((n % k == 0) || (n % k == k)) return 1 + countDivisibleBy(n-1,k);
		else return countDivisibleBy(n-1,k);
	}

	public static void main(String[] args) {
		System.out.println(countDivisibleBy(10,3)); // You can add debugging statements here to test your methods!
	}
}
