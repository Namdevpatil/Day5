package day5_typeOfClasses;

//Abstract class
public abstract class Department
{
	//non-static fields
	private int departmentId;
	private String departmentName;

	//static fields
	public  static String departmentCode;


	//constructors	
	public Department() 
	{

	}

	public Department(int departmentId, String departmentName) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	//blocks 
	static
	{
		departmentCode = "+91";
	}

	//methods
	//non-static method
	public String getEmployee() 
	{
		return "Employee [id=" + departmentId + ", name=" + departmentName + "]";
	}

	//static method
	public static String getCountryCode()
	{
		return departmentCode;
	}
	
	//+ abstract method
	public abstract void getInfo();

	//inner/nested classes
	class A
	{

	}
	
}
