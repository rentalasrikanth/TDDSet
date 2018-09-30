package com.tdd;

public class Set<T> {
	
	int size;
	Set()
	{
		size = 0;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void add(int i) {
		size++;
	}

	public int size() {
		return size;
	}

}
