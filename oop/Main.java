package oop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Hotel hotel1 = new Hotel();
		
		hotel1.setHeat(25);
		hotel1.setColor("blue");
		hotel1.setArea(400);
		hotel1.setLocation("Aqaba");
		hotel1.setNuOfFloors(4);
		hotel1.setRent(150);
		
		hotel1.condition();
		
		
		
		Hotel hotel2 = new Hotel("white",300,"Amman",3,10,200);
		
		hotel2.condition();
		
		
		
		//------------------------------------------------------------------------
		
		
		System.out.println("------------------------------------------------------");
		
		
		
		Home home1 = new Home();
		
		home1.setHeat(13);
		home1.setColor("yellow");
		home1.setArea(130);
		home1.setLocation("Jarash");
		home1.setRent(20000);
		
		home1.condition();
		
		
		
		Home home2 = new Home("white",110,"Zarqa",20,30000);
		
		home2.condition();
		
		
		
		//------------------------------------------------------------------------
		System.out.println("------------------------------------------------------");
		
		
		System.out.println("Do you want to buy a house or rent in a hotel?");
		System.out.println("If you want to buy a home, write: home");
		System.out.println("If you want to rent in a hotel, write: hotel");
		
		Scanner obj7 = new Scanner(System.in);
		String opinion7 = obj7.next();
		
		if(opinion7.toLowerCase().equals("hotel"))
		{
		
		
		System.out.println("Hello,our company has two hotels in Jordan");
		System.out.println("Do you want to see their information and choose which hotel you  want to rent?");
		
		Scanner obj1 = new Scanner(System.in);
		String opinion1 = obj1.next();
		
		if(opinion1.toLowerCase().equals("yes"))
		{
		
		System.out.println("The first hotel is in " + hotel1.getLocation()+ " / The hotel area is " + hotel1.getArea() + " M  / Room rent for Each night is " + hotel1.getRent() + " JD ");
		
		System.out.println("Do you want to book in this hotel?");
		
		Scanner obj2 = new Scanner(System.in);
		String opinion2 = obj2.next();
		
		if(opinion2.toLowerCase().equals("yes"))
		{
			System.out.println("Thank you for dealing with us. send request email to (Osama@gmail.com) and mention how many nights do you want to reserve");
			return;
		}
		
		else if(opinion2.toLowerCase().equals("no"))
		{
			System.out.println("The second hotel is in " + hotel2.getLocation()+ " / The hotel area is " + hotel2.getArea() + " M  / Room rent for Each night is " + hotel2.getRent() + " JD ");
		
			
			
			System.out.println("Do you want to book in this hotel?");
			
			Scanner obj3 = new Scanner(System.in);
			String opinion3 = obj3.next();
			
			if(opinion3.toLowerCase().equals("yes"))
			{
				System.out.println("Thank you for dealing with us. send request email to (Osama@gmail.com) and mention how many nights do you want to reserve ");
			}
			
			else if(opinion3.toLowerCase().equals("no"))
				System.out.println("Thanks for sharing your opinion. Goodbye");
			
			
			else
			System.out.println("Wrong answer");
		}
		
		}
		
		
		else if(opinion1.toLowerCase().equals("no"))
			System.out.println("Sorry For Disturb");
		
		
		else
		System.out.println("Wrong answer");
			
		
		
		
		}
		
	
		
		
		//------------------------------------------------------------------------
		
		
		System.out.println("------------------------------------------------------");
		
		
		if(opinion7.toLowerCase().equals("home"))
		{
		
		
		System.out.println("Hello,our company has two homes in Jordan");
		System.out.println("Do you want to see their information and choose which home you  want to buy?");
		
		Scanner obj4 = new Scanner(System.in);
		String opinion4 = obj4.next();
		
		if(opinion4.toLowerCase().equals("yes"))
		{
		
		System.out.println("The first home is in " + home1.getLocation()+ " / The home area is " + home1.getArea() + " M  / The home price is " + home1.getRent() + " JD " + " / The home color is " +home1.getColor() );
		System.out.println("Do you want to buy this home?");
		
		
		Scanner obj5 = new Scanner(System.in);
		String opinion5 = obj5.next();
		
		if(opinion5.toLowerCase().equals("yes"))
		{
			System.out.println("Thank you for dealing with us. send request email to (Osama@gmail.com)");
			return;
		}
		
		
		else if(opinion5.toLowerCase().equals("no"))
		{
			System.out.println("The second home is in " + home2.getLocation()+ " / The home area is " + home2.getArea() + " M  / The home price is " + home2.getRent() + " JD " + " / The home color is " +home2.getColor() );
		
			System.out.println("Do you want to buy this home?");
			
			
			Scanner obj6 = new Scanner(System.in);
			String opinion6 = obj6.next();
			
			
			if(opinion6.toLowerCase().equals("yes"))
			{
				System.out.println("Thank you for dealing with us. send request email to (Osama@gmail.com)");
			}
			
			else if(opinion6.toLowerCase().equals("no"))
				System.out.println("Thanks for sharing your opinion. Goodbye");
			
			else
			System.out.println("Wrong answer");
			
		}
		}
		
		else if(opinion4.toLowerCase().equals("no"))
			System.out.println("Sorry For Disturb");
		
		
		else
		System.out.println("Wrong answer");
		
		}
		
		else if(opinion7.toLowerCase() != ("home") && (opinion7.toLowerCase() != ("hotel")))
		{
			System.out.println("wrong entry");
		}
		
		
		
		
	}

}
