package com.bridgelab.algorithmprogram;

public class InsertionSort {

	public static void main(String[] args) {

		InsertionSort sort = new InsertionSort();

		String names[] = { "Amit", "Nandini", "Manish", "Kiran", "Mahesh", "Kirti" };

		sort.printArray(names);
		sort.sortByInsertion(names);
		sort.printArray(names);

		Integer values[] = { 45, 19, 25, 64, 76, 11 };

		sort.printArray(values);
		sort.sortByInsertion(values);
		sort.printArray(values);
	}

	public <t extends Comparable<t>> t[] sortByInsertion(t array[]) {

		for (int i = 1; i < array.length; i++) {
			t temp = array[i];
			int j = i;

			while (j > 0 && (array[j - 1].compareTo(temp) > 0)) {
				array[j] = array[j - 1];
				j = j - 1;
			}
			array[j] = temp;
		}
		return array;
	}

	public <t> void printArray(t array[]) {
		System.out.println("Printing the Array : ");
		for (t element : array) {
			System.out.println(element);
		}
	}
}
