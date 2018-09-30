package com.tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SetTest {
	
	@Test
	public void testSet_isEmpty_InitialSet() {
		
		Set set = new Set();
		assertEquals(true, set.isEmpty());
	}
	
	@Test
	public void testSet_sizeIsZero_InitialSet() {
		
		Set set = new Set();
		assertEquals(0, set.size());
	}
}