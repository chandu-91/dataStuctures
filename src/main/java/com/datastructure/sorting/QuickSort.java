package com.datastructure.sorting;

public class QuickSort {

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "  ");
		}

	}

	public static void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);
			quickSort(array, start, pivot-1 );
			quickSort(array, pivot + 1,end);
		}

	}

	private static int partition(int[] array, int start, int end) {
		int pivot = end;
		int i = start - 1;
		for (int j = start; j <= end; j++) {
			if (array[j] <= array[pivot]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;
	}

}
