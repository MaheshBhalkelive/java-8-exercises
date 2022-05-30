package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();  
		//Adding Products  
		employeeList.add(new Employee(1,"Ram",25000f));  
		employeeList.add(new Employee(2,"Shyam",30000f));  
		employeeList.add(new Employee(3,"Gita",18000f));  
		employeeList.add(new Employee(4,"Sita",8000f));  
		employeeList.add(new Employee(5,"Raman",90000f));
		
		
		
		
		
		
		List<employeeList> List2= employeeList.stream().filter(e->e.salary).collect(Collectors.toList());

		list2.sort();

	}

}
