package lambdaExpressions;

import java.util.function.Supplier;
import java.util.Date;

public class SupplierInterface {
	
	public static void main(String[] args) {
	
	Supplier<String> sup=()->"Uttam";
	Supplier<Date> sup1=()->new Date();
	
	System.out.println(sup.get()+ " today date is "+ sup1.get());
	}

}
