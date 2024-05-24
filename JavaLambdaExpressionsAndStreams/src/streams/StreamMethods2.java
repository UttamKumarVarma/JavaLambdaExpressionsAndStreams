package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StreamMethods2 {

	
	//Sorted method originally helps to return the objects in ascending order(numbers smallest - highest and for string based on alphabets)
	public static void main(String[] args) {

		
		List<Integer> list= Arrays.asList(5,4,3,2,1);
		
		// printing value in ascending order
		System.out.println(list.stream().sorted().collect(Collectors.toList()));
		
		//printing values in descending order
		System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
		System.out.println("***************** Sorted Method on Strings ***************************");
		List<String> stringList= Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "Three");
		
		// printing value in ascending order
		System.out.println(stringList.stream().sorted().collect(Collectors.toList()));
		
		// printing value in descending order
		System.out.println(stringList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		
		
		
		
		
	}

}
