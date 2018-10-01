package com.tdd;

public class Set<T> {
	int size;
	int array[];
	Set(int capacity)
	{
		size = 0;
		array = new int[capacity];
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

	public boolean contains(int i) {
		return false;
	}
}
