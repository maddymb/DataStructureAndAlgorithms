package com.SolvingQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ComparingArray {

	public void containsCommanItems1(int arr1[], int arr2[]) {
		
		for(int i = 0; i<arr1.length; i++) {
			
			System.out.println(i);
			
			for(int j=0; j<arr2.length-1; j++) {
				
				if(arr1[i]==arr2[j]) {
					
					System.err.println(true);
				}
			}		
	
		}
	}
	
	public void containsCommanItems2(int arr1[], int arr2[]) {
		
		Map map=new HashMap();
		for(int i=0; i<arr1.length; i++) {
			
				map.put(arr1[i], true);
			
			
		}
		
		for(int j=0; j<arr2.length; j++) {
			
		    Set set=map.entrySet();  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext()){  
		    Map.Entry entry=(Map.Entry)itr.next();  
		    System.out.println(entry.getKey()+" "+entry.getValue());
		    
		    map.entrySet().toArray();
		    Object[] arr = map.keySet().toArray();
		    
		    
		    
		  //  if(arr2[j]==arr) {
		    	
		    	
		   // }
		    
		    

		    
		    
		    }  
		  
		
		
		}
		
}
	
	
	
	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {9,10,11,5,6};
		
		ComparingArray objComparingArray= new ComparingArray();
		objComparingArray.containsCommanItems1(arr1, arr2);
		objComparingArray.containsCommanItems2(arr1, arr2);	
			
		}
		
}


