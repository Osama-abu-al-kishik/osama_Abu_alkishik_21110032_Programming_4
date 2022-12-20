package inheritance;

public class Tablet extends Drug{
	
	
	
	public Tablet() {
		super();
	}
	public Tablet(String category, String dateOfmanufacture, String company, String name, int noOfPieces) {
		
		
		super(category,dateOfmanufacture,company);
		this.name = name;
		NoOfPieces = noOfPieces;
	}
	
	
	
	private String name;
	private int NoOfPieces;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfPieces() {
		return NoOfPieces;
	}
	public void setNoOfPieces(int noOfPieces) {
		NoOfPieces = noOfPieces;
	}
	
	
	public void  PrintData()
	{
		super.PrintData();
		System.out.println("The name is " + getName() + " The NoOfPieces is " + getNoOfPieces());
	}
	

}
