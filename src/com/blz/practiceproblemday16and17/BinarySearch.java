package com.blz.practiceproblemday16and17;

/*
 //* @Purpose:  Binary Search
 a. Desc-> Read in a list of words from File. Then prompt the user to enter a word to
    search the list. The program reports if the search word is found in the list.
b. I/P -> read in the list words comma separated from a File and then enter the word
to be searched
c. Logic -> Use Arrays to sort the word list and then do the binary search
d. O/P -> Print the result if the word is found or not
*/
public class BinarySearch {
	public <T extends Comparable<T>> Integer binarySearch(String[] array, String data) {
		Integer first = 0;
		Integer last = array.length;

		Integer mid = (first + last) / 2;

		if (data.compareTo(array[mid]) == 0) {
			return mid;
		} else if (data.compareTo(array[mid]) > 0) {
			first = mid + 1;
			return binarySearch(array, data);
		} else if (data.compareTo(array[mid]) < 0) {
			last = mid - 1;
			return binarySearch(array, data);
		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		BinarySearch binary = new BinarySearch();
		String[] array = { "hii", "bye", "good", "bad", "my" };
		Integer result = binary.binarySearch(array, "good");
		if (result == -1) {
			System.out.println("Element Found Is Not Found");
		} else {
			System.out.println("Element Found At Position " + result);
		}
	}

}
