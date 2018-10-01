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
		if(indexOf(val) == -1)
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
			/*return false;
		else
			return true;*/
		
		/*for(int element : array)
		{
			if(element == val)
				return true;
		}
		return false;*/
	}
	// [2,1,3,0,0] // [2, 1, 0, 0, 0]
	public void remove(int val) {
		index = indexOf(val);
		
		if(index == -1)
			return;
		
		array[index] = array[size-1];
		size--;
	
		/*for(int element : array)
		{
			if(element == val)
			{
				array[index] = array[array.length -1]; // Moving the last element to the index where the element is being removed.
				size--;
				break;
			}
			index++;
		}*/
		
		/*for(int element : array)
		{
			array[index] = array[index +1]; // Moving the next element to the index where the element is being removed.
			index++;
		}*/
		//size--;
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
