package streams;

import java.util.Arrays;
import java.util.List;

public class StreamMethods4 {

	public static void main(String[] args) {
		List<String> list1=Arrays.asList("One", "Two", "Three", "One", "Two", "Three", "Three" );
		
		//returns any object from the stream
		System.out.println(list1.stream().findAny().get());
		//returns first object from the stream
		System.out.println(list1.stream().findFirst().get());

	}

}
