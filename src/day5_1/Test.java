package day5_1;


public class Test {

	public static void main(String[] args) {
		
		
		/*
		 * Employee employee1 = new Employee(101, "dinesh", "SE", "Development",
		 * 79765.34, "USA"); Employee employee2 = new Employee(102, "Jayesh", "Tester",
		 * "QA", 89565.34, "USA"); Employee employee3 = new Employee(103, "sunny",
		 * "Cloud Architect", "Deployment", 89723.34, "USA"); Employee employee4 = new
		 * Employee(104, "mohan", "BA", "Management", 90765.34, "USA");
		 */
		
		Employee employee11 = new Employee();
		employee11.setId(101);
		employee11.setName("dinesh");
		employee11.setDesignation("SE");
		employee11.setDepartment("Development");
		employee11.setSalary(79765.34);
		employee11.setAddress("USA");
		
		
		
		Employee employee12 = new Employee();
		employee12.setId(105);
		employee12.setName("ramesh");
		employee12.setDesignation("Tester");
		employee12.setDepartment("QA");
		employee12.setSalary(60393.34);
		employee12.setAddress("USA");
		
			
		//Employee employees[] = {employee1, employee2, employee3, employee4};
		
		Employee employees[] = {employee11, employee12};
		
		for(Employee employee: employees) 
		{
			System.out.println(employee.getAllEmployees());		
		}

	}

}
