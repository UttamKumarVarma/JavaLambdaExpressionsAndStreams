package streams;


import java.util.*;

//any match, all match, and none match

public class StreamMethods3 {

	public static void main(String[] args) {
		
		//Set only contains unique values
		Set<String> list= new HashSet<String>();
		
		list.add("Uttam is good");
		list.add("Raju is good");
		list.add("Ravi is good");
		list.add("Revi is bad");
		list.add("Nikhil is bad");
		
		//any match - checks atleast one object present in the list satisfies the condition and return boolean.
		System.out.println(list.stream().anyMatch(x->x.contains("is")));
		
		//allMatch - checks all objects present in the list satisfies the condition and return boolean.
		System.out.println(list.stream().allMatch(x->x.contains("is")));
		
		//none - checks if all objects does not satisfies the condition and return boolean.
		System.out.println(list.stream().noneMatch(x->x.contains("is")));
		
		

	}

}
