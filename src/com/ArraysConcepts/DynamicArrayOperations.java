package com.ArraysConcepts;

import java.util.Iterator;
@SuppressWarnings("unchecked")
public class DynamicArrayOperations <T> implements Iterable<T>{

	private T [] arr;
	private int len =0; // length user thinks array is
	private int capacity=0; // Actual size of array
	
	public DynamicArrayOperations() {
		
		this(16);
		
	}
	
	
	
	public DynamicArrayOperations(int capacity) {
		
		if (capacity<0) {
			throw new IllegalArgumentException("Illegal Capacity"+ capacity);
		}
		this.capacity= capacity;
		arr= (T[]) new Object[capacity];
		
		
	}

	public int size() {
		return len;
	}
	
	public boolean isEmpty() {
		return size()==0;
	}

	public T get(int index) {
		
		return arr[index];
	}
	
	public void set(int index, T value) {
		
		arr[index]= value;
	}
	
	public void clear() {
		for(int i=0; i<capacity; i++) {
			arr[i]=null;
			len=0;
		}
	}

	
	public void add(T value) {
		
		if(len+1>= capacity) {
			if(capacity==0) {
				
				capacity=1;
			}			
			
		}
		else 
			capacity= capacity*2;
		
		T [] new_arr= (T[]) new Object[capacity];
		
		for(int i=0 ; i<arr.length; i++) {
			
			 new_arr[i]=arr[i];
			 arr= new_arr;
			 
		}
		
		arr[len++]=value;
		
		
	}
	
	public void print() {
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
	}



	@Override
	public Iterator<T> iterator() {
		return null;
	}
	
	public static void main(String [] args) {
		
		DynamicArrayOperations<Integer> obj= new DynamicArrayOperations<>(3);
		obj.set(0,1);
		obj.set(1,12);
		obj.set(2,5);
		obj.add(6);
		obj.print();
		
		
		//System.err.println(arr);
		
	}

	
	
	
	
	
	
}
