package week3.day1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {
		int[] data = {4,3,6,8,29,1,2,4,7,8};

		Set<Integer>unq =new LinkedHashSet<Integer>();
		Set<Integer>dup =new LinkedHashSet<Integer>();

		for(int i=0;i<data.length;i++){
			boolean add=unq.add(data[i]);
			if(!add) {
		dup.add(data[i]);

		}
		}
		System.out.println(dup);
		
	}
}

	


