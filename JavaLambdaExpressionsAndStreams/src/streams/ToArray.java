package streams;

import java.util.Arrays;
import java.util.List;

public class ToArray {
	
	//This method 'toArray()' return Object Array

	public static void main(String[] args) {
		
		List<String> list1=Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "Three" );
		
		 Object[] arr = list1.stream().toArray();
		 
		 for(Object a: arr)
			 System.out.println(a);

	}

}
