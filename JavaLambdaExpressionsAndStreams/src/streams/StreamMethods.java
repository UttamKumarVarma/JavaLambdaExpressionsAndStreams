package streams;

import java.util.Arrays;
import java.util.*;

public class StreamMethods {
	
	//distinct, limit, and count

	public static void main(String[] args) {

		List<String> list1=Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "Three" );
		
		
		//Distinct methods gives output as unique objects
		list1.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("***********************");
		
		//Limit method helps to limit objects
		list1.stream().limit(3).forEach(System.out::println);
		
		System.out.println("***********************");
		
		//count method helps to limit objects
		System.out.println(list1.stream().count());
		
		
	}

}
