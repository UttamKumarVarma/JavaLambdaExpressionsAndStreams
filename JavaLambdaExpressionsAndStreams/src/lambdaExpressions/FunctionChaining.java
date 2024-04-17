package lambdaExpressions;

import java.util.function.Function;

/*
 * Function Chaining- 
 * andThen()
 * compose()    
 * 
 *        These two methods work opposite to each other
 * 
 * 
 */

public class FunctionChaining {

	public static void main(String[] args) {
		Function<Integer, Integer> fun= imp->imp*2;
		Function<Integer, Integer> fun2= imp->imp*imp*imp;
		
		System.out.println(fun.apply(2));
		System.out.println(fun2.apply(2));
		
		//Using andThen()
			System.out.println(fun.andThen(fun2).apply(2));// Here fun executed first with value 2 and then fun2 will executes
		//using compose()
			System.out.println(fun.compose(fun2).apply(2));// Here fun2 executed first with value 2 and then fun will executes. Finally reverse to andThen method
	}

}
