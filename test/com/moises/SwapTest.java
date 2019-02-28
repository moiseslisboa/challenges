package com.moises;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SwapTest {

	@Test
	void countSwaps_oneItemArray_shouldReturnZero() {
		int result = Swap.countSwaps(new int[]{1});
		assertThat(result, equalTo(0));
	}
	
	@Test
	void countSwaps_twoItemOrderedArray_shouldReturnZero() {
		int result = Swap.countSwaps(new int[]{1,2});
		assertThat(result, equalTo(0));
	}
	
	@Test
	void countSwaps_twoItemUnorderedArray_shouldReturnZero() {
		int result = Swap.countSwaps(new int[]{2,1});
		assertThat(result, equalTo(1));
	}
	
	@Test
	void countSwaps_NItensUnorderedArray_shouldReturnNumberOfSwaps() {
		int result = Swap.countSwaps(new int[]{1,3,5,2,4,6,7});
		assertThat(result, equalTo(3));
	}
	
	@Test
	void countSwaps2_NItensUnorderedArray_shouldReturnNumberOfSwaps() {
		int result = Swap.countSwaps(new int[]{4,3,1,2});
		assertThat(result, equalTo(3));
	}
	
	
	
	
	
	

}
