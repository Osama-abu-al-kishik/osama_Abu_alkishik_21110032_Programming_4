package employees;

public class Staff {
	
	public Staff()
	{
		
	}
	
	
	
	
	Staff(String name,int ExperienceYear,double baseSalary,String emp_id,String Department)
	{
		this.name = name;
		this.ExperienceYear = ExperienceYear;
		this.baseSalary = baseSalary;
		this.emp_id = emp_id;
		this.Department = Department;
	}
	
	
	
	
	private String name;
	private static int ExperienceYear;
	private static double baseSalary;
	private static String emp_id;
	private String Department;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static int getExperienceYear() {
		return ExperienceYear;
	}
	public void setExperienceYear(int experienceYear) {
		ExperienceYear = experienceYear;
	}
	public static double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public static String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String Department) {
		this.Department = Department;
	}
	
	

}
