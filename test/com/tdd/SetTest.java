package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class SetTest {
	
	@Test
	public void testSet_isEmpty_InitialSet() {
		
		Set set = new Set();
		assertEquals(true, set.isEmpty());
		assertEquals(0, set.size());
	}
	
	@Test
	public void testSet_isEmpty_AddOneElement() {
		Set set = new Set();
		set.add(1);
		assertEquals(false, set.isEmpty());
	}
	
	@Test
	public void testSet_isEmpty_AddTwoElements() {
		Set set = new Set();
		set.add(1);
		set.add(2);
		assertFalse(set.isEmpty());
	}
}