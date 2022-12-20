package inheritance;

public class PainReliever extends Tablet{

	
	public PainReliever() {
		super();
	}
	
	
	public PainReliever(String category, String dateOfmanufacture, String company, String name, int noOfPieces,int dosageUnit, int useWithinDays) {
		super(category, dateOfmanufacture,company,name,noOfPieces);
		DosageUnit = dosageUnit;
		UseWithinDays = useWithinDays;
	}
	
	
	
	
	private int  DosageUnit;
	private int UseWithinDays;
	
	
	
	public int getDosageUnit() {
		return DosageUnit;
	}
	public void setDosageUnit(int dosageUnit) {
		DosageUnit = dosageUnit;
	}
	public int getUseWithinDays() {
		return UseWithinDays;
	}
	public void setUseWithinDays(int useWithinDays) {
		UseWithinDays = useWithinDays;
	}
	
	
	public void  PrintData()
	{
		super.PrintData();
		System.out.println("The DosageUnit is " + getDosageUnit() + " The UseWithinDays is " + getUseWithinDays());
	}
	
}
