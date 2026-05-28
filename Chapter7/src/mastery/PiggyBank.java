/*

Program: PiggyBank.java          Last Date of this Revision: May 28, 2026

Purpose: stores the information used for MySavings.java


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/
package mastery;

public class PiggyBank 
{
	private int pennies;
	private int nickels;
	private int dimes;
	private int quarters;
	
	public void addPenny()	{pennies ++;}
	public void addNickel()	{nickels ++;}
	public void addDime()	{dimes ++;}
	public void addQuarter()	{quarters ++;}
	
	public double getTotal() 
	{	return (pennies * 1 + nickels * 5 + dimes * 10 + quarters * 25) / 100.0;
	}

	public void removeAll()
	{ pennies = nickels = dimes = quarters = 0;
	}

}
