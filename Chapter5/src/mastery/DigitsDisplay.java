/*

Program: DigitsDisplay.java          Last Date of this Revision: May 6, 2026

Purpose:	Displays a integers ones spot, tens spot, hundreds spot, etc.
Author: 	Kaleb Nieboer
School:		CHHS
Course: 	Computer Science 20
 

*/

package mastery;

import java.util.Scanner;

public class DigitsDisplay 
{
	

	
	    public static void main(String[] args) 
	    {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter a non-negative integer: ");
	        int number = input.nextInt();

	        if (number < 0) 
	        {
	            System.out.println("Error, enter a non-negative integer");
	            return;
	        }
	        String digits = Integer.toString(number);
	        	for (int i = 0; i < digits.length(); i++)
	        	{
	        		System.out.println(digits.charAt(i));
	        	}
	    
	    }	    
}

// SCREEN DUMP
/*
Enter a non-negative integer: 987
9
8
7
*/
