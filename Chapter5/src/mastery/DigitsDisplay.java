package mastery;

import java.util.Scanner;

public class DigitsDisplay 
{
	

	
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a non-negative integer: ");
	        int number = input.nextInt();

	        while (number > 0) 
	        {
	            System.out.println(number % 10);
	            number = number /  10;
	        }
	    
	    
	    }	    
}


