package com.bigO;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		
		for(int i=0; i<arr.length; i++) { // O(n)
			
			for(int j=i+1; j<arr.length; j++) { // O(n)
				
				System.err.println(arr[i]+" "+arr[j]); 
				
			}	
		}
		
	}

}

// O(n^2)  Quadratic Time Horrible
// Thumb Rule : If there is a nested loop then it will n*n
