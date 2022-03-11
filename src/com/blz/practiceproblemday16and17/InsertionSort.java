package com.blz.practiceproblemday16and17;

import java.util.Scanner;

/**
 * //* @Purpose: Insertion Sort a. Desc -> Reads in strings and prints them in
 * sorted order using insertion sort. b. I/P -> read in the list words c.
 * Logic->Use Insertion Sort to sort the words in the String array d. O/P ->
 * Print the Sorted List
 * 
 * 
 **/

public class InsertionSort {
	static Scanner scanner = new Scanner(System.in);

	/*
	 * @purpose: Ability to insertion sort
	 * 
	 * @param: Takes String array as input
	 * 
	 * @function : sorts the given array in ascending order and stores them in their
	 * indecencies
	 * 
	 * @return: No return value.
	 */
	static public void insertionSort(String[] array) {
		for (int i = 1; i < array.length; i++) {
			String key = array[i];
			int j = i - 1;
			// Compare key with each element on the left of it until an element smaller than
			// it is found.
			// For descending order, change key<array[j] to key>array[j].
			while (j >= 0 && (key.compareTo(array[j]) < 0)) {
				array[j + 1] = array[j];
				--j;
			}
			// Place key at after the element just smaller than it.
			array[j + 1] = key;
		}
	}

	/*
	 * @purpose: Ability to print String array
	 * 
	 * @param: Takes String array as input
	 */
	static public void printString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.println("string at index " + i + " is " + strings[i]);
		}
	}

	/*
	 * @purpose: Ability to scan String array
	 */
	static public void scanString(String[] strings) {
		for (int i = 0; i < strings.length; i++) {
			System.out.printf("Enter the string at index :%d\n", i);
			strings[i] = scanner.nextLine();
		}
	}

	// main method
	public static void main(String[] args) {
		String[] strings = new String[5];
		scanString(strings);
		System.out.println("Elements are:");
		printString(strings);
		insertionSort(strings);
		System.out.println(" Sorting elements");
		printString(strings);

	}
}