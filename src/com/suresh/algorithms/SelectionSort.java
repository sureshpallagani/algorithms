package com.suresh.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int[] intArr = {20, 35, -15, 7, 55, 1, -22};

		for(int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largestAtIndex = 0;
			for (int i = 0; i <= lastUnsortedIndex; i++) {
				if (intArr[i] > intArr[largestAtIndex]) {
					largestAtIndex = i;
				}
			}
			CommonFunctions.swap(intArr, largestAtIndex, lastUnsortedIndex);
		}
		CommonFunctions.printArray(intArr);
	}

}
