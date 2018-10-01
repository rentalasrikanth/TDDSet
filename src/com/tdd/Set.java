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
		array[size] = i;
		size++;
	}

	public int size() {
		return size;
	}

	public boolean contains(int i) {
		for(int element : array)
		{
			if(element == i)
				return true;
		}
		return false;
	}
}
