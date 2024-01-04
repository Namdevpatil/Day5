package day5_2;


public class Test {

	public static void main(String[] args) {
		
		
		Employee employee11 = new Employee();
		
		employee11.setId(101);
		employee11.setName("dinesh");
		employee11.setDesignation("SE");
		employee11.setDepartment("Development");
		employee11.setSalary(79765.34);
		employee11.setAddress("USA");
		
		System.out.println(employee11.getAllEmployees());
		
		System.out.println("======================================================================================");
		
		
		
		Employee employee12 = new Employee();
		
		employee12.setId(105);
		employee12.setName("ramesh");
		employee12.setDesignation("Tester");
		employee12.setDepartment("QA");
		employee12.setSalary(60393.34);
		employee12.setAddress("USA");
		
		System.out.println(employee12.getAllEmployees());
		
	}

}
