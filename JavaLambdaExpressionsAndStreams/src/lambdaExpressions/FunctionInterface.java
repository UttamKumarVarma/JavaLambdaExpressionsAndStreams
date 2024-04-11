package lambdaExpressions;
import java.util.function.Function;

public class FunctionInterface {
	
	public static void main(String[] a) {
		
		Function<Integer,Integer> fun= p->p*p;
		System.out.println(fun.apply(5));
		
		//First value next return type
		Function<String,Integer> fun2=data->data.length();
		System.out.println(fun2.apply("Uttam"));
	}

}
