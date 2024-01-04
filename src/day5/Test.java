package day5;


public class Test {

	public static void main(String[] args) {
		
		
		Employee employee1 = new Employee(101, "dinesh", "SE", "Development", 79765.34, "USA");
		Employee employee2 = new Employee(102, "Jayesh", "Tester", "QA", 89565.34, "USA");
		Employee employee3 = new Employee(103, "sunny", "Cloud Architect", "Deployment", 89723.34, "USA");
		Employee employee4 = new Employee(104, "mohan", "BA", "Management", 90765.34, "USA");
			
		Employee employees[] = {employee1, employee2, employee3, employee4};
		
		for(Employee employee: employees) 
		{
			System.out.println(employee.getAllEmployees());		
		}

	}

}
