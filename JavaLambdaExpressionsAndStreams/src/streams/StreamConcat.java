package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//StreamConcat used to combine two streams

public class StreamConcat {
	
	
	public static void main(String[] args) {
		List<String> list1=Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "Three" );
		List<String> list2=Arrays.asList("Eight", "Nine" );
		
		Stream s1=list1.stream();
		Stream s2=list2.stream();
		
		Stream s3= Stream.concat(s1, s2);
		
		s3.forEach(System.out::println);
		
		// or
		
		System.out.println("************** or ********");
		
		Stream.concat(list1.stream(), list2.stream()).forEach(System.out::println);;
	}

}
