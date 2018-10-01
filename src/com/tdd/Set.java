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
	// [2,1,3,0,0] // [2, 1, 0, 0, 0]
	public void remove(int i) {
		for(int element : array)
		{
			if(element == i)
			{
				/*array[index] = array[array.length -1]; // Moving the last element to the index where the element is being removed.
				size--;*/
				break;
			}
			index++;
		}
		
		for(int element : array)
		{
			array[index] = array[index +1]; // Moving the next element to the index where the element is being removed.
		}
		size--;
	}
}
