/*

Program: AddCoins1.java          Last Date of this Revision: May 22, 2026

Purpose:	Calculates how much total money you have based on how many coins you have
Author: 	Kaleb Nieboer
School:		CHHS
Course: 	Computer Science 20
 

*/
package mastery;

import java.util.Scanner;

public class AddCoins1 { 
	public static String getDollarAmount(int pennies, int nickels, int dimes, int quarters) {
	       int totalCents = pennies + (nickels * 5) + (dimes * 10) + (quarters * 25);
	       int dollars = totalCents / 100;
	       int cents = totalCents % 100;
	       return String.format("$%d.%02d", dollars, cents);
	   }

	   public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	       System.out.println("Enter your total coins ");
	       System.out.print("Amount of Quarters: ");
	       int quarters = input.nextInt();
	       System.out.print("Amount of Dimes: ");
	       int dimes = input.nextInt();
	       System.out.print("Amount of Nickels: ");
	       int nickels = input.nextInt();
	       System.out.print("Amount of Pennies: ");
	       int pennies = input.nextInt();
	       System.out.println("Total dollar amount: " + getDollarAmount(pennies, nickels, dimes, quarters));
	       input.close();
	   }
	}

/* 
Enter your total coins
Amount of Quarters: 4               
Amount of Dimes: 3      
Amount of Nickels: 2
Amount of Pennies: 9
Total dollar amount: $1.49
 */

