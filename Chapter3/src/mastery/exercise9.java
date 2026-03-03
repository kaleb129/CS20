package mastery;


	import java.util.Scanner;
	public class exercise9
	{
		public static void main(String[] args)
		{
			double BirthY, BirthM, BirthD;
			
			double CurrentY, CurrentM, CurrentD;
			
			double daysA, hoursA, hoursS;
			
			Scanner input = new Scanner(System.in);
			
				System.out.println("Enter the year you were born :  ");
				BirthY = input.nextDouble();
			
				System.out.println("Enter the month you were born:  ");
				BirthM = input.nextDouble();
				
				System.out.println("Enter the day you were born :  ");
				BirthD = input.nextDouble();
		
			Scanner inputA= new Scanner(System.in);
			
				System.out.println("Enter the current year : ");
				CurrentY = inputA.nextDouble();
			
				System.out.println("Enter the current month : ");
				CurrentM = inputA.nextDouble();
			
				System.out.println("Enter the current day : ");
				CurrentD = inputA.nextDouble();
			
			
			daysA = (CurrentY * 365 + CurrentM * 30 + CurrentD - BirthY * 365 - BirthM * 30 - BirthD);
			
			hoursA = (daysA * 24);
			hoursS = (daysA * 8);
			
			System.out.println("You have been alive for " + (daysA) + " days!");
			System.out.println("You have spent " + (hoursS) + " hours sleeping.");
		}
		
	}

 
