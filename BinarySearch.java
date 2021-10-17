package com.bridgelab.algorithmprogram;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		String names[] = { "Navya", "Sunanda", "Naval", "Gayatri", "Nikita", "Shivani", "Pooja", "Amit" };
		Arrays.sort(names);

		BinarySearch search = new BinarySearch();
		search.printArray(names);
		search.binarySearch(names);
	}

	public <t extends Comparable<t>> void binarySearch(t array[]) {
		Scanner scanner = new Scanner(System.in);
		Arrays.sort(array);
		int li = 0;
		int hi = array.length - 1;
		int mi = (li + hi) / 2;
		
		System.out.println("Enter the element you want to search in the List : ");
		t search = (t)scanner.nextLine();
		while (li <= hi) {

			if (array[mi].equals(search)) {
				System.out.println("Your searched element " + search + " present at " + mi + " index.");
				break;
			} else if (array[mi].compareTo(search) > 0) {
				hi = mi - 1;
			} else {
				li = mi + 1;
			}
			mi = (li + hi) / 2;

			if (li > hi) {
				System.out.println("Your searched element " + search + " is not present.");
			}
		}
	}

	public <t> void printArray(t array[]) {
		System.out.println("Elements in the List are : ");
		for (t element : array) {
			System.out.println("\t\t\t" + element);
		}
	}
}
