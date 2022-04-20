package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import sampletests.Employee;

public class FunctionalProgrammingEmployeeTest1 {
	
	private int id;
	private String name;
	private int salary;
	
	public FunctionalProgrammingEmployeeTest1() {
		super();
	}
	public FunctionalProgrammingEmployeeTest1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(100, "employee1", 10000));
		employees.add(new Employee(101, "employee2", 17000));
		employees.add(new Employee(102, "employee3", 9000));
		employees.add(new Employee(103, "employee4", 25000));
		employees.add(new Employee(104, "employee5", 19000));
		employees.add(new Employee(105, "employee6", 8000));
		employees.add(new Employee(106, "employee7", 28000));
		
		System.out.println("(2) list of all emoployees having salary more than 15000...");
		 employees.stream().filter(e->e.salary > 15000).forEach(e->System.out.println(e.id+" "+e.name +" "+ e.salary));
		
		
		System.out.println("(3) Total no of employees having salary  than 15000...");
		List<Employee> List2= employees.stream().filter(e->e.salary > 15000).collect(Collectors.toList());
		long count = List2.stream().count();
		System.out.println("No of employees : "+ count);
		
		System.out.println("(4) Name of all employee in capital letter...");
		employees.stream().forEach(e->System.out.println((e.name).toUpperCase()));	
		
	}
}
