package mastery;


	import java.util.Scanner;

	public class Gradeapplication 
	{
	public static void main(String[] args) 
	
	{
	
		Scanner input = new Scanner(System.in);

	
		double percentage;
	
		String letterGrade;

	
	
		System.out.print("Enter the percentage you achieved: ");
	
		percentage = input.nextDouble();

	
		if (percentage >= 90) 
	{
	
			letterGrade = "A";
	} 
		else if (percentage >= 80) 
	
	{
	
			letterGrade = "B";
	} 
		else if (percentage >= 70) 
	
	{
	
			letterGrade = "C";
	} 
		else if (percentage >= 60) 
	
	{
	
			letterGrade = "D";
	} 
		else 
	
	{
	
			letterGrade = "F";
	}

	
		System.out.println("You got the letter grade: " + letterGrade);

	
		
	}
	
	}


