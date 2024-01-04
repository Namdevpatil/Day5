package day5_2;

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
	
	//setters 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	//method
	public String getAllEmployees()
	{
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", salary=" + salary + ", address=" + address + "]";
	}
	
}
