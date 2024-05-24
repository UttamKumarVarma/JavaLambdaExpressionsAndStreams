package streams;

import java.util.Arrays;
import java.util.*;

public class Reduce {

	public static void main(String[] args) {
		
		// Reduce method is used to Combine or Add all methods
		
		
		//Adding all the Integer objects
		
		List<String> list= Arrays.asList("1","2","3","4","5","6","7","8");
		
		System.out.println(list.stream().reduce((val1,val2)->val1+val2).get());
		
		
		//Adding all the Integer objects
		
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(list1.stream().reduce((val1,val2)->val1+val2).get());

	}

}
