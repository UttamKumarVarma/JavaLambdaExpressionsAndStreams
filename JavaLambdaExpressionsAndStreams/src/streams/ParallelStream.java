package streams;

import java.util.Arrays;
import java.util.List;

//Runs parallel and executes faster
public class ParallelStream {

	public static void main(String[] args) {
		
		List<String> list= Arrays.asList("1","2","3","4","5","6","7","8");
		
		list.stream().parallel().map(x->x.length()).forEach(System.out::println);
		
		
		//or
		list.parallelStream().map(x->x.length()).forEach(System.out::println);

	}

}
