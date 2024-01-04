package day5;

public class Employee 
{
	//fields
	private int id;
	private String name;
	private String designation;
	private String department;
	private double salary;
	private String address;
	
	//we can initialize fields of a class using constructor/setter methods
	
	//constructor
	public Employee() 
	{
		
	}

	public Employee(int id, String name, String designation, String department, double salary, String address) 
	{
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.salary = salary;
		this.address = address;
	}

	//method
	public String getAllEmployees()
	{
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", salary=" + salary + ", address=" + address + "]";
	}
		
	
}
