package com.tdd;

public class Set<T> {
	
	boolean isEmpty;
	int size;
	Set()
	{
		isEmpty = true;
		size = 0;
	}

	public boolean isEmpty() {
		return isEmpty;
	}

	public void add(int i) {
		isEmpty = false;
		size++;
	}

	public int size() {
		return size;
	}

}
