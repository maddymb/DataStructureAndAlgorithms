package com.bigO;

import java.util.Date;

public class Test1 {

	
	
	public void findingAvenger(String arr[]) {
		
		Date date = new Date();
	    long time1=date.getTime();
		//System.out.println(time1);
		
	    for(int i=0; i<arr.length; i++) {
			System.err.println("Value of i "+(i+1));
	    	if(arr[i]=="Hulk") {
				
				System.out.println("Found Avenger!");
				break; // increasing the efficiency , loop wont run after finding Hulk
				
			}
			
		}
	   
		long time2=date.getTime();
		//System.out.println(time2);
			
		System.err.println("Time took to run this function "+(time2-time1));
		// Big O ----->
		//O(n) -----> Linear Time  // n is number of inputs
		//O(1) -----> Constant Time 
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String arr[] = {"Iron Man","Hulk","Captain America","Hawk Eye","Thor","Black Widow"};
		Test1 obj= new Test1();
		obj.findingAvenger(arr);
		
		
		
		
	}

}
