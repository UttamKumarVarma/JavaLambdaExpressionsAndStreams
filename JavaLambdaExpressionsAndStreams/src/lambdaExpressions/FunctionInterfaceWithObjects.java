package lambdaExpressions;

import java.util.ArrayList;
import java.util.function.Function;

public class FunctionInterfaceWithObjects {

	public static void main(String[] args) {

		Function<Employee1,String> emp = employee -> {
					if(employee.salary>10000 && employee.name.length()>4) {
						return employee.name+": is eligible";
					}
					return employee.name+": Not eligible";
					
				};
		Employee1 employee = new Employee1("Uttam", 1, 20000);

		System.out.println(emp.apply(employee));

		// Multiple objects
		ArrayList<Employee1> emps = new ArrayList<Employee1>();
		emps.add(new Employee1("Uttam", 1, 2000));
		emps.add(new Employee1("Rama", 2, 10000));
		emps.add(new Employee1("Rajamouli", 3, 200));
		emps.add(new Employee1("Baahu", 4, 30000));
		emps.add(new Employee1("Madhu", 5, 80000));
		emps.add(new Employee1("Mani", 6, 90000));
		emps.add(new Employee1("Nithin", 7, 0));
		System.out.println("Multiple Objects---->");

		for (Employee1 data : emps) {
				System.out.println(emp.apply(data));
		}

	}

}

class Employee1 {
	String name;
	int id, salary;

	Employee1(String name, int id, int salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;

	}

}