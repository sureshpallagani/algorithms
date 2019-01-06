package com.suresh.algorithms;

public class CommonFunctions {

	static int[] getInitialArray() {
		return new int[] {20, 35, -15, 7, 55, 1, -22};
	}

	static void swap(int[] intArr, int i, int j) {
		if(i == j) {
			return;
		}
		int temp = intArr[i];
		intArr[i] = intArr[j];
		intArr[j] = temp;
	}

	static void printArray(int[] intArr) {
		for(int i=0; i<intArr.length; i++) {
			System.out.println(intArr[i]);
		}
	}

}
