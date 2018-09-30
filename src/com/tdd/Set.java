package com.tdd;

public class Set<T> {
	
	boolean isEmpty;
	Set()
	{
		isEmpty = true;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void add(int i) {
		isEmpty = false;
	}

	public int size() {
		return 0;
	}

}
