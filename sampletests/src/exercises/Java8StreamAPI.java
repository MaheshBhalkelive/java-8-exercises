package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8StreamAPI {
	
	public int id;
	public String name;
	public int salary;
	
	public Java8StreamAPI() {
		super();
	}
	public Java8StreamAPI(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String[] args) {
		
		List<Java8StreamAPI> emp = new ArrayList<>();
		emp.add(new Java8StreamAPI(100, "employee1", 10000));
		emp.add(new Java8StreamAPI(101, "employee2", 17000));
		emp.add(new Java8StreamAPI(102, "employee3", 9000));
		emp.add(new Java8StreamAPI(103, "employee4", 25000));
		emp.add(new Java8StreamAPI(104, "employee5", 19000));
		emp.add(new Java8StreamAPI(105, "employee6", 8000));
		emp.add(new Java8StreamAPI(106, "employee7", 28000));
		
		System.out.println(" list of all emoployees having salary more than 15000...");
		emp.stream().filter(e->e.salary > 15000).forEach(e->System.out.println(e.id+" "+e.name +" "+ e.salary));
		
		
		System.out.println(" Number of employees having salary  than 15000...");
		List<Java8StreamAPI> List2= emp.stream().filter(e->e.salary > 15000).collect(Collectors.toList());
		long count = List2.stream().count();
		System.out.println("No of employees : "+ count);
		
		System.out.println(" Name of all employee in capital letter...");
		emp.stream().forEach(e->System.out.println((e.name).toUpperCase()));

	}

}
