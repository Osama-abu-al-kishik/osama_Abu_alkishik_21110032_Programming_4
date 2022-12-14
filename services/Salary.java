package services;


public class Salary {
	
	
	public static double calculateSalary(double baseSalary, int ExperienceYear, String emp_id)
	 {
		if(emp_id.charAt(0) == 'M')
		{
			return baseSalary + ExperienceYear * 50 + 100;
		}
		
		return baseSalary + ExperienceYear * 50;
	 }
	


}
