package streams;

import java.util.Arrays;
import java.util.*;

public class MinAndMaxValues {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

		// even number
		list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

		System.out.println("***************** Min Value *****************************");

		// minimum number
		Optional<Integer> value = list.stream().min((val1, val2) -> {

			return val1.compareTo(val2);
		});
		System.out.println(value.get());

		System.out.println("***************** Max Value *****************************");
		
		
		System.out.println(list.stream().max((val1,val2)-> val1.compareTo(val2)).get());
		
		//The return type for both Min and Max methods is Optional class type.
		
		
	}

}
