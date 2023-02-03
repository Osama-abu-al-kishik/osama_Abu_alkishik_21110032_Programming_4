package oop;

public class Home 
{
	
	//constructors
	
	public Home(String color,int area, String location,int heat,int cost) 
	{
		//initialize attribute
		this.color = color;
		this.area = area;
		this.location = location;
		this.heat = heat;
		this.rent = cost;
	
	}
	
	public Home() 
	{
		//initialize attribute
	}
	
	//--------------------------------------------------------------

	//attributes
	private String color;
	private int area;
	private String location;
	private int heat;
	private int rent;
	
	//--------------------------------------------------------------
	
	
	//getters setters color
	
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	
	
	//getters setters area
	
	public int getArea()
	{
		return area;
	}
	public void setArea(int area) 
	{
		this.area = area;
	}
	
	
	//getters setters location
	
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location) 
	{
		this.location = location;
	}

	
	//getters setters heat
	
	public int getHeat() {
		return heat;
	}

	public void setHeat(int heat) {
		this.heat = heat;
	}
	
	
	//getters setters rent
	
	public int getRent() {
		return rent;
	}

	public void setRent(int cost) {
		this.rent = cost;
	}

	
	
	
	//--------------------------------------------------------------
	
		//methods
		
		public void condition()
		{
			
			if(heat <= 15)
				System.out.println("The windows in home close");
			
			
			else 
				System.out.println("The windows in home open");

		}

		

}
