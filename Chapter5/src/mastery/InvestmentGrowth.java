/*

Program: InvestmentGrowth.java          Last Date of this Revision: May 7, 2026

Purpose: Shows how much money you will have made through an investment after a certain amount of years


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/



package mastery;

public class InvestmentGrowth 
{ 
	
	    public static void main(String[] args) 
	    {
	        double balance = 2500.0;
	        double investmentgoal = 5000.0;
	        double rate = 0.075;
	        int years = 0;

	        while (balance < investmentgoal) 
	        {
	            balance = balance + (balance * rate);
	            years = years + 1;
	        }

	        System.out.println("Years to reach your investment goal: " + years);
	        System.out.println("Final balance: $" + (int)(balance * 100) / 100.0);
	    }
	} 

//SCREEN DUMP
/* 
Years to reach your investment goal: 10
Final balance: $5152.57
*/