package com.revature;

import java.util.Iterator;

public class MyArrayList<T> implements Iterable<T> {

	private T[] arr;
	private int currentNumOfElements = 0;
	private int capacity = 0;
	
	public MyArrayList(int capacity) {
		if (capacity < 0) {
			throw new IllegalArgumentException("Illegal capacity specified");
		}
		
		this.capacity = capacity;
		arr = (T[]) new Object[capacity];
	}
	
	public MyArrayList() {
		this(8); // constructor chaining
	}
	
	public int size() {
		return this.currentNumOfElements;
	}
	
	public boolean isEmpty() {
		return this.currentNumOfElements == 0;
	}
	
	public T get(int index) {
		if (index < 0 || index > currentNumOfElements - 1) {
			throw new IndexOutOfBoundsException();
		}
		
		return arr[index];
	}
	
	public void set(int index, T elem) {
		arr[index] = elem;
	}
	
	public void clear() {
		for (int i = 0; i < capacity; i++) {
			arr[i] = null;
		}
		
		this.currentNumOfElements = 0;
	}
	
	public void add(T elem) {
		if (this.currentNumOfElements + 1 >= capacity) {
			if (capacity == 0) {
				capacity = 1;
			} else {
				capacity = capacity * 2;
			}
			
			T[] newArr = (T[]) new Object[capacity];
			for (int i = 0; i < currentNumOfElements; i++) {
				newArr[i] = arr[i];
			}
			
			this.arr = newArr;
		}
		
		arr[currentNumOfElements] = elem;
		currentNumOfElements++;
	}
	
	public T removeAt(int rmIndex) {
		if (rmIndex >= currentNumOfElements || rmIndex < 0) {
			throw new IndexOutOfBoundsException();
		}
		
		T data = arr[rmIndex];
		T[] newArr = (T[]) new Object[currentNumOfElements - 1];
		
		for (int i = 0, j = 0; i < currentNumOfElements; i++, j++) {
			if (i == rmIndex) {
				j--;
			} else {
				newArr[j] = arr[i];
			}
		}
		
		this.arr = newArr;
		capacity = --currentNumOfElements;
		return data;
	}
	
	public boolean remove(Object obj) {
		for (int i = 0; i < currentNumOfElements; i++) {
			if (arr[i].equals(obj)) {
				removeAt(i);
				return true;
			}
		}
		
		return false;
	}
	
	public int indexOf(Object obj) {
		for (int i = 0; i < currentNumOfElements; i++) {
			if (arr[i].equals(obj)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean contains(Object obj) {
		if (indexOf(obj) != -1) {
			return true;
		}
		
		return false;
	}
	
	@Override
	public Iterator<T> iterator() {
		
		// This is an anonymous class being implemented via the Iterator interface
		return new Iterator<T>() {
			
			int idx = 0;
			
			public boolean hasNext() {
				return idx < currentNumOfElements;
			}
			
			public T next() {
				return arr[idx++];
			}
			
		};
	}
	
	@Override
	public String toString() {
		if (currentNumOfElements == 0) {
			return "[]";
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append("[");
			
			for (int i = 0; i < currentNumOfElements - 1; i++) {
				sb.append(arr[i] + ", ");
			}
			
			sb.append(arr[currentNumOfElements - 1] + "]");
			
			return sb.toString();
		}
	}
	
}
