package day5_4;

public class Employee 
{
	
	//non-static fields
	private int id;
	private String name;
	

	public Employee() 
	{
		
	}

	//constructor parameters
	
	//to access/invoke non-static members
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}
