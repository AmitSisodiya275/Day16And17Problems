package com.bridgelab.algorithmprogram;

public class BubbleSort {

	public static void main(String[] args) {

		String names[] = { "Navya", "Sunanda", "Naval", "Gayatri", "Nikita", "Shivani", "Pooja", "Amit" };

		Integer values[] = { 78, 54, 62, 89, 42, 69, 459, 235 };

		BubbleSort bubbleSort = new BubbleSort();

		System.out.println("Performing sorting using Bubble Sort.");
		System.out.println("Array before sorting : ");
		bubbleSort.printArray(names);
		bubbleSort.printArray(values);
		System.out.println("Array after sorting : ");
		bubbleSort.sortByBubbleSort(names);
		bubbleSort.printArray(names);
		bubbleSort.sortByBubbleSort(values);
		bubbleSort.printArray(values);
	}

	public <t extends Comparable<t>> void sortByBubbleSort(t array[]) {
		t temp;
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array.length - 1 - i; j++) {

				if (array[j].compareTo(array[j + 1]) > 0) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public <t> void printArray(t array[]) {
		System.out.println("Elements in the Array : ");
		for (t element : array) {
			System.out.println("\t\t\t" + element);
		}
	}
}
