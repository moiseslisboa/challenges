package com.moises;

public class Swap {

	public static int countSwaps2(int[] array) {
		
		int smaller = 1;
		int swapCounter = 0;
		for(int i = 0; i < array.length ; i++) {
			if(smaller == array[i] && array[smaller-1] != smaller) {
				int temp = array[smaller - 1];
				array[smaller - 1] = smaller;
				array[i] = temp;
				swapCounter++;
				i = smaller-1;
				smaller++;
			} else if(array[smaller-1] == smaller) {
				smaller++;
			}
		}
		return swapCounter;
	}
	
public static int countSwaps(int[] array) {
		
		int swapCounter = 0;
		for(int i = 0; i < array.length ; i++) {
			if(array[i] != i+1) {
				int temp = array[array[i]-1];
				array[array[i]-1] = array[i]; 
				array[i] = temp;
				swapCounter++;	
			} 
			if(array[i] != i+1) {
				i--;
			}
		}
		return swapCounter;
	}
}
