package day5_typeOfClasses;

//General/Concrete class
public class Employee 
{
	
	//non-static fields
	private int id;
	private String name;
	
	//static fields
	public  static String countryCode;

	
	//constructors	
	public Employee() 
	{
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//blocks 
	static
	{
		countryCode = "+91";
	}

	//methods
	//non-static method
	public String getEmployee() 
	{
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	//static method
	public static String getCountryCode()
	{
		return countryCode;
	}
	
	//inner/nested classes
	class A
	{
		
	}
	
}
