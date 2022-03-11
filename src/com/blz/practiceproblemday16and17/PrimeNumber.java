package com.blz.practiceproblemday16and17;

/**
//* @Purpose: To find prime numbers in the range of 0 to 1000
a. Desc -> Take a range of 0 - 1000 Numbers and find the Prime numbers in that range..
b. O/P -> prime numbers from 0 10 1000

**/

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the range:");
		System.out.print("Lower Bound: ");
		int first = scan.nextInt();

		System.out.print("Upper Bound: ");
		int second = scan.nextInt();

		for (int i = first; i <= second; i++)
			if (isPrime(i))
				System.out.println(i);
	}

	static boolean isPrime(int n) {
		int count = 0;

		// 0, 1 negative numbers are not prime
		if (n < 2)
			return false;

		// checking the number of divisors b/w 1 and the number n
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}

		// if reached here then must be true
		return true;
	}
}