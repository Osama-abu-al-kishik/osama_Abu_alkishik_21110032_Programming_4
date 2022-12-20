package inheritance;

public class Drug {

	
	
	public Drug() {
		
	}
	
	public Drug(String category, String dateOfmanufacture, String company) {
		
		this.category = category;
		this.dateOfmanufacture = dateOfmanufacture;
		this.company = company;
		
		
	}
	
	
	private String category;
	private String dateOfmanufacture;
	private String company;
	
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDateOfmanufacture() {
		return dateOfmanufacture;
	}
	public void setDateOfmanufacture(String dateOfmanufacture) {
		this.dateOfmanufacture = dateOfmanufacture;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	
	public void  PrintData()
	{
		System.out.println("The category is " + getCategory() + " The dateOfmanufacture is " + getDateOfmanufacture() + " The company is " + getCompany());
	}
	
	
}
