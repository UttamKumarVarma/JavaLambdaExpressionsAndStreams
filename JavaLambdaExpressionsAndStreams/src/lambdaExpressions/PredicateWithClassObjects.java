package lambdaExpressions;

import java.util.function.Predicate;
import java.util.*;

public class PredicateWithClassObjects {
	
	public static void main(String[] args) {
	
	
	Predicate<Employee> emp=employee-> employee.name.length()>4 && employee.salary>10000;
	Employee employee= new Employee("Uttam",1,20000);
	
	System.out.println(emp.test(employee));
	
	
	//Multiple objects
	ArrayList<Employee> emps= new ArrayList<Employee>();
	emps.add(new Employee("Uttam",1,2000));
	emps.add(new Employee("Rama",2,10000));
	emps.add(new Employee("Rajamouli",3,200));
	emps.add(new Employee("Baahu",4,30000));
	emps.add(new Employee("Madhu",5,80000));
	emps.add(new Employee("Mani",6,90000));
	emps.add(new Employee("Nithin",7,0));
	System.out.println("Multiple Objects---->");
	
	for(Employee data: emps) {
		
		if(emp.test(data)) {
			System.out.println("Employee ID: "+data.id+"\n Employee: "+ data.name+"\n Salary: "+data.salary);
		}
	}
	
	
	
	}
	

}

class Employee {
	String name;
	int id, salary;
	
	Employee(String name, int id, int salary){
		 this.name= name;
		 this.id=id;
		 this.salary=salary;
		
	}
	
	
}
