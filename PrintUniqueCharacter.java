package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	

	public static void main(String[] args) {
		//Input
		String value="Janaki";
		String output=" ";
		@SuppressWarnings("unused")
		
		//convert string to char array
		char[] ch =value.toCharArray();
		
		@SuppressWarnings("unused")
		
		//Create new Set
		Set <Character> name= new LinkedHashSet<Character>();
		
			
		for(Character i : ch) {
			
			
			name.add(i);
				
				
			
		}
		System.out.println(name);
		}
		


	}



