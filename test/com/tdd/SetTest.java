package com.tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SetTest {

	Set<Integer> set;
	@Before
	public void setUp()
	{
		set = new Set<Integer>(3);
	}

	@Test
	public void testSet_isEmpty_InitialSet() {
		assertEquals(true, set.isEmpty());
		assertEquals(0, set.size());
		assertEquals(false, set.contains(1));
	}

	@Test
	public void testSet_WithOneElementAddedtoSet() {
		set.add(1);
		assertEquals(false, set.isEmpty());
		//assertTrue(set.contains(1));
	}

	@Test
	public void testSet_WithTwoElementsAddedtoSet() {
		set.add(1);
		set.add(2);
		assertFalse(set.isEmpty());
		assertTrue(set.contains(1));
		assertTrue(set.contains(2));
		assertFalse(set.contains(3));
	}
}