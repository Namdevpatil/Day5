package day5_typeOfClasses;

public class Test {
	

	public static void main(String[] args) {
		
		//able to create an Instance/Object for Concrete/General class
		Employee employee11 = new Employee(101, "dinesh");
		
		System.out.println(employee11.getEmployee());
		
		System.out.println("=============================");
		
		System.out.println(Employee.getCountryCode());
		
		System.out.println("===============abstract class==============");
		
		//- Cannot instantiate the type Department
		//Department department = new Department();
		
		System.out.println("===============Interface class==============");
		
		//- Cannot instantiate the type Organization
		//Organization organization = new Organization();
		
	}

}
