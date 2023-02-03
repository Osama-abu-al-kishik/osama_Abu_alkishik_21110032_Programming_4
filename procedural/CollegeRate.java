package procedural;

import java.util.Scanner;

public class CollegeRate {

	public static void main(String[] args) {
		System.out.println(" To calculate the cumulative average ");
		System.out.println(" enter semesters number do you want to calculate ");
		Scanner obj5 = new Scanner(System.in);
		int semesters = obj5.nextInt();
		
		double cumulative = 0;
		double num3 = 0;
		double num4 = 0;
		
		for(int i = 1; i <= semesters; i++)
		{
		
		if(semesters > 1)
			System.out.println("How many total hours in semester " + i);
		
		else if(semesters == 1)
			System.out.println("How many total hours in this semester");
		
		else
			System.out.println("Unacceptable");
			
		Scanner obj2 = new Scanner(System.in);
		int hours = obj2.nextInt();
		
		
		if( hours >= 6 && hours <= 21)
		{
			
			System.out.println("How many subjects are taught in semester " + i);
			Scanner obj1 = new Scanner(System.in);
			int subject = obj1.nextInt();
			
			
			double res = Calculate(subject,hours);
			
			
			double rate = res / hours;
			
			
			if(rate != 0)
			{
			System.out.println("Your rate in semester "+ i +" = " + rate);
			}
			
			else
			{
				return;
			}
			
			num3 = num3 + (rate * hours);
			num4 = num4 + hours;
			
			cumulative = num3 / num4;
			
		}
			
		else
		{
			System.out.println("Unacceptable number of hours in universities");
			return;
		}
		
	
		
		}
		System.out.println("Your cumulative average in all semesters "+ cumulative);
	}
	
	
	
	public static double Calculate(int subject,int hours)
	{
		double num5 = 0;
		double num2 = 0;
		
		for(int i = 1; i <= subject;i++)
		{
			
			System.out.println("How many hours are in subject "+i );
			Scanner obj3 = new Scanner(System.in);
			double hourOfSub = obj3.nextDouble();
			
				System.out.println("Enter Your final mark in subject "+i );
				Scanner obj4 = new Scanner(System.in);
				double mark = obj4.nextDouble();
				
				
				double num1 = (hourOfSub * mark);
				 num2 = num2 + num1;
				 
				
				 num5 =  num5 + hourOfSub;
				 		
		}
		
		
		 if(num5 != hours)
		 {
			 System.out.println("The total number of hours enterd does not equal the total number of hours");
			 return 0;
		 }
		
		return num2;

	
		
	}
	

}
