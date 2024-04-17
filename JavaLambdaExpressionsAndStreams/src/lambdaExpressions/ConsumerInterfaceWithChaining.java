package lambdaExpressions;

import java.util.function.Consumer;

//Consumer contains accept method accepts one argument and does not return any value.

public class ConsumerInterfaceWithChaining {

	public static void main(String[] args) {
		Consumer<String> con= (value)->System.out.println(value);
		con.accept("Uttam");
		
		
		//chaining, it uses anThen method
		Consumer<String> con1= (value)->System.out.println(value+" is good");
		Consumer<String> con2= (value)->System.out.println(value+" always do all the work on time");
		Consumer<String> con3= (value)->System.out.println(value+" punctual");
		
		
		con1.andThen(con2).andThen(con3).accept("Uttam");
		
		//This can also be stored in object of Consumer Interface
		Consumer<String> con4= con1.andThen(con2).andThen(con3);
		con4.accept("Nithin");
		
		
		
	}

}
