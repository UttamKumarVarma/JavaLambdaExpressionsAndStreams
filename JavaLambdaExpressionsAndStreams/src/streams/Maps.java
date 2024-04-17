package streams;

import java.util.Arrays;
import java.util.*;

//Uses Consumer Predefined interface.

public class Maps {
	
	public static void main(String[] a) {
		
		List<String> utt= Arrays.asList("Uttam","Nani","Rani","revi");
		utt.stream().map(x->x.toUpperCase()).forEach(System.out::println);
	}

}
