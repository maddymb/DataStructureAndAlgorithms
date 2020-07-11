package com.programs;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
			
		String a= "abc";
		String b = "abb";
		
		solutionOne(a, b);
		solutionTwo(a, b);
		
		

	}
	
	
	public static void solutionOne(String One, String Two ) {
		if(One.length()==Two.length()) {
			char[] oneArray = One.toCharArray(); // converted the string into character array
			char[] twoArray = Two.toCharArray();
			Arrays.sort(oneArray); 		// sort the converted array
			Arrays.sort(twoArray);
			One = new String(oneArray);		// create string after converting the array
			Two = new String(twoArray);
			if(One.equals(Two)) {			// check whether strings are equal or not
				System.out.println("Anagram");				
			}else
				System.out.println("Not Anagram");
		}
		else
			System.out.println("Can't Be Anagram");
		
	}
	
	public static void solutionTwo(String one , String two) {
		boolean isAnagram = false;
		
		if(one.length()==two.length()) {
			for(int i = 0; i<one.length(); i++) {
				char a = one.charAt(i);
				
				for(int j =0; j<two.length(); j++) {
					if(two.charAt(j)==a) {
						isAnagram= true;
						break;	
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
		else{
			System.out.println("Can't Be Anagram");
		}
		
		
		if(isAnagram) {
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
		
		
	}
	
	
	
	

}
