package streams;

import java.util.ArrayList;


public class CombinationOfFilterAndMap {

	public static void main(String[] args) {
		
		
		//Multiple objects
		ArrayList<Employee> emps= new ArrayList<Employee>();
		emps.add(new Employee("Uttam",1,2000));
		emps.add(new Employee("Rama",2,10000));
		emps.add(new Employee("Rajamouli",3,200));
		emps.add(new Employee("Baahu",4,30000));
		emps.add(new Employee("Madhu",5,80000));
		emps.add(new Employee("Mani",6,90000));
		emps.add(new Employee("Nithin",7,0));
		
		
		//prints employee details having salary more than ten thousand
		
//		emps.stream().filter(x->x.salary>10000).map(y-> 
//		
//			String s= "Employee ID is: "+y.id+" and his name is "+y.name;
//		
//				
//				
//				
//				
//				);
		
		
		
		

	}

}

class Employee{
	
	String name;int id,salary;
	
	Employee(String name,int id, int salary){
		
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
}
