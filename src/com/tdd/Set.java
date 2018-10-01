package com.tdd;

public class Set<T> {
	int size;
	int array[];
	int index;
	Set(int capacity)
	{
		size = index = 0;
		array = new int[capacity];
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void add(int val) {
		if(!contains(val))
		{
			array[size] = val;
			size++;
		}
	}

	public int size() {
		return size;
	}

	public boolean contains(int val) {
		index = indexOf(val);
		
		return (index != -1);
	}
	
	public void remove(int val) {
		index = indexOf(val);
		
		if(index == -1)
			return;
		
		array[index] = array[size-1];
		size--;
	}
	
	public int indexOf(int val)
	{
		for(int i = 0; i < array.length ; i++)
		{
			if(array[i] == val)
				return i;
		}
		return -1;
	}
}
