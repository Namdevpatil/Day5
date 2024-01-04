package day5_typeOfClasses;

//Interface type class
public interface Organization 
{

	//- non-static fields	
	//- static fields
	
	//+ public static final fields	
	public static final int ORGANIZATION_ID = 2029;
	public static final String ORGANIZATION_NAME = "XYZ Pvt Ltd.";	
	public static final String COUNTRY_CODE = "+91";
	
	//- constructors
	//- blocks
	
	//methods
	
	//- non-static methods
	
	//+ static methods
	public static String getCountryCode()
	{
		return COUNTRY_CODE;
	}
	
	//+ Abstract methods
	public String getOrganizationDetails();	

}
