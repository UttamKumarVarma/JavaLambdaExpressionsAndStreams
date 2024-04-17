package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Consumer;

public class Filters {

	public static void main(String[] a) {

		List<String> uttam = Arrays.asList("1", "2", "three", "five", "six");

		List<String> data = uttam.stream().filter(i -> i.contains("i")).collect(Collectors.toList());
		
		Consumer<String> con=c->System.out.println(c);
		
		for(String s: uttam) {
			con.accept(s);
		}

		// To print everything at the same time or to do operation on each object present in the ;list at the same time
		uttam.stream().filter(i -> i.contains("x")).forEach(y -> System.out.println(y));
		
		//Directly print without using consumer accept() implementation
		System.out.println("print without using consumer accept() implementation");
		uttam.stream().filter(i -> i.contains("x")).forEach(System.out::println);
		
		
		//removing null values
		System.out.println("removing null values");
		List<String> nithin = Arrays.asList("1", null, null, "five", "six");
		nithin.stream().filter(w->w!= null).forEach(System.out::println);
		
	}

}
