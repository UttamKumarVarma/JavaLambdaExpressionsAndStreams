package lambdaExpressions;

import java.util.function.Predicate;

public class Predicateinterface {
	
	public static void main(String[] args) {

		// Implements 'test' Method in Predicate Interface. Return type of test method
		// is boolean
		Predicate<Integer> p = i -> (i > 10);

		System.out.println(p.test(3));

		// check length of a string
		Predicate<String> valueLength = (data) -> data.length() > 4;

		String[] values = { "Uttam", "Raju", "Ravi", "Revi", "Rajesh" };
		for (String value : values) {
			if (valueLength.test(value))
				System.out.println(value);
		}
	}

}
