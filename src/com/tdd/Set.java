package com.tdd;

public class Set<T> {
	int size;
	int array[];
	int index;
	int capacity;
	Set(int capacity)
	{
		size = index = 0;
		array = new int[capacity];
		this.capacity = capacity;
	}

	public boolean isEmpty() {
		return (size == 0);
	}

	public void add(int val) {

		if(contains(val)) return;
		
		if(full())
			resize();
		
		array[size] = val;
		size++;
	}

	private boolean full() {
		return size == capacity;
	}
	
	private void resize() {
		int[] resizedArray = new int [capacity *2];
		
		for(int index = 0; index < array.length; index++)
			resizedArray[index] = array[index];
		
		array = resizedArray;
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
