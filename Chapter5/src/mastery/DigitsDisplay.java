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

	        while (number > 0) 
	        {
	            System.out.println(number % 10);
	            number = number /  10;
	        }
	    
	    
	    }	    
}

// SCREEN DUMP
/*
Enter a non-negative integer: 900
0
0
9
*/
