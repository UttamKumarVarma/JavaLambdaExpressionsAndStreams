package lambdaExpressions;

import java.util.function.Predicate;

//joining predicates - and, or, and negate

public class MultiplePredicates {

	public static void main(String[] args) {

		int[] arr = { 5,15,20,25,30,35,40,45,50,55,60,65 };
		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 50;
		System.out.println("Following are numbers EVEN & Greater than 50.....");
		for (int n : arr) {
			if (p1.and(p2).test(n)) { //// if(p1.test(n) && p2.test(n))
				System.out.println(n);
			}
		}
		
		System.out.println("Negate used to print remianing numbers- here Following are numbers not EVEN & less than 50.....");
		for (int n : arr) {
			if (p1.and(p2).negate().test(n)) { //// if(p1.test(n) && p2.test(n))
				System.out.println(n);
			}
		}
	}

}
