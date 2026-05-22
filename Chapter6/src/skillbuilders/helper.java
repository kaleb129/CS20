package skillbuilders;

public class helper {




 
	public static void sayHello() 
	{
	
	
	System.out.println("Hello! Welcome to learning method!");
	
	}
	
	public static void greetPerson(String name, int age)
	{
		System.out.println("Hi "+ name + "!");
		System.out.println("You are "+ age + "years old.");
		
		if(age >= 18) 
		{
			System.out.println("your old enough to drive");
		}
		else 
		{
			System.out.println("your still young!");
		} 
		System.out.println("-----------------------------------------");
	
	} 
	
	public static double calculateCircleArea(double radius)
	{
		double area = Math.PI * radius * radius;
		
		return area; 
	}
	
	public static String getMoodMessage(int happinessLevel)
	{
		if(happinessLevel >= 80)
		{
			return("your absolutely glowing today");
		}
		else if(happinessLevel >= 50)
		{
			return("your doing alright");
		}
		else
		{ 
			return("yikes man");
		}
	
	} 
	
	
	
	public static void main(String[] args)
	{
		
		System.out.println("=== demonstrating methods===\n");
		
		//calling method #1
		sayHello();
		
		//calling method #2 with arguments
		
		greetPerson("Sara",  14);
		greetPerson("liam",  16);
		
		//calling method #3 using the return value
		double r = 5.0;
		double area = calculateCircleArea(r);
		System.out.println("circle has an area of: "+ area);
	}
	

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	