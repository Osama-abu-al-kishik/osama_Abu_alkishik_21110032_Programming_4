package oop;

public class Hotel extends Home
{
	
	
	//constructors
	
	public Hotel(String color,int area, String location, int nuOfFloors,int heat,int rent) 
	{
		//initialize attribute
		super(color,area, location,heat,rent);
		this.nuOfFloors = nuOfFloors;
	}
	
	public Hotel() 
	{
		//initialize attribute
	}


	//--------------------------------------------------------------

	//attributes
	
	private int nuOfFloors;


	//--------------------------------------------------------------
	
	
	//getters setters nuOfFloors

	public int getNuOfFloors() 
	{
		return nuOfFloors;
	}

	public void setNuOfFloors(int nuOfFloors) 
	{
		this.nuOfFloors = nuOfFloors;
	}
	
	

	
	//--------------------------------------------------------------
	
	//methods
	
	public void condition()
	{
		
		this.setHeat(getHeat());
		
		if(getHeat() >= 27)
		{
			System.out.println("The air conditioner in hotel works cold");
		}
		
		else if(getHeat() <= 14)
		{
			System.out.println("The air conditioner in hotel is running warm");
		}
		
		else
		{
			System.out.println("The air conditioner in hotel is off because the weather is fine");
		}
	
	}
	
	
	
	
	
	
	
	
	

}
