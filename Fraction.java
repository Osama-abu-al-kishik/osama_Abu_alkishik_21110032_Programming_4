package oop2;

public class Fraction {
	
	
	public Fraction(int Numerotor,int denominator)
	{
		this.Numerotor = Numerotor;
		this.denominator = denominator;
		count++;
	}
	
	
	private int Numerotor;
	private int denominator;
	public static int count = 0;
	
	public int getNumerotor() {
		return Numerotor;
	}
	public void setNumerotor(int numerotor) {
		Numerotor = numerotor;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public void printFraction()
	{
		
		
	System.out.println( "The fraction is" + Numerotor + "/" + denominator );
	}
	
	
	
	public void FractionSum(Fraction f)
	{
		
		int den,num;
		if(f.denominator == denominator)
		{
			num = Numerotor + f.Numerotor;
			den = denominator;
		}
		
		else
		{
			
			num = Numerotor * f.denominator + f.Numerotor * denominator;
			den = f.denominator * denominator;
		}
		
		System.out.println( "The fraction is" + Numerotor + "/" + denominator );

		
	}

}
