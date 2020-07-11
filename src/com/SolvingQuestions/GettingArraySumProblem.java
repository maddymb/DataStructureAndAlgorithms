package com.SolvingQuestions;

public class GettingArraySumProblem {

	public void solution1(int arr[], int sum) { //O(n^2)
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i]+arr[j]==sum) {
					
					System.out.println("The two number are "+arr[i]+" "+ arr[j]);
				}
			
			}	
		}
	}
	
	public void solution2(int arr[], int sum) {
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {1,3,2,4};
		
		GettingArraySumProblem objGettingArraySumProblem= new GettingArraySumProblem();
		objGettingArraySumProblem.solution1(arr,3);

	}

}
