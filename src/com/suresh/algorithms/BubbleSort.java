package com.suresh.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int[] intArr = CommonFunctions.getInitialArray();
		//We start from the last, in every iteration the largest number will be pushed to lastUnsortedIndex.
		//The sorted part will never be considered for sort again.
		for(int lastUnsortedIndex = intArr.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			for(int i=0; i<lastUnsortedIndex; i++) {
				if (intArr[i] > intArr[i+1]) {
					CommonFunctions.swap(intArr, i, i + 1);
				}
			}
		}
		CommonFunctions.printArray(intArr);
	}
	
}
