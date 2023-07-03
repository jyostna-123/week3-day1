package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		
		String data="PayPal India";
		String output=" ";
		char[] ch =data.toCharArray();
		
		Set <Character> dupCharSet= new LinkedHashSet<Character>();
		

		for(Character i : ch) {
			
			if(dupCharSet.add(i)){
				output=output+i;
				
			}
				
		}
		
		System.out.println(output);
		System.out.println(dupCharSet);
	  
		

	}
}
	