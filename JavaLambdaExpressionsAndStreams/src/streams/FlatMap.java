package streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class FlatMap {

	public static void main(String[] args) {
		
		//Map
		List<Integer> list1= Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2= list1.stream().map(i->i+10).collect(Collectors.toList());
		
		System.out.println(list2);
		
		//FlatMap
		List<Integer> lst1= Arrays.asList(1,2);
		List<Integer> lst2= Arrays.asList(3,4);
		List<Integer> lst3= Arrays.asList(5,6);
		
		List<List<Integer>> finalList= Arrays.asList(lst1,lst2,lst3);
		
		finalList.stream().flatMap(i->i.stream()).forEach(System.out::println);
		
		
		//Here object from each list is stored in stream and after all these objects are collected to another list.
		List<Integer> finalData= finalList.stream().flatMap(i->i.stream()).map(x->x+10).collect(Collectors.toList());
		System.out.println(finalData);
		
		
		//Here after using flatmap. We used map again to do some operation on each of the objects
		finalList.stream().flatMap(i->i.stream()).map(x->x.toString()).forEach(System.out::println);
		
		
		

	}

}
