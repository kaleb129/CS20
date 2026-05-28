/*

Program: MySavings.java          Last Date of this Revision: May 26, 2026

Purpose: Your own personal piggy bank


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/
package mastery;
import java.util.Scanner;

public class MySavings 
{
	public static void main(String[] args) 
	{ Scanner scanner = new Scanner(System.in);
	PiggyBank bank = new PiggyBank();
	int choice = -1;
	
	while (choice != 5) 
	{ System.out.println("\n--- My Savings ---");
	System.out.println("1. Show total in bank");
	System.out.println("2. Add a penny");
	System.out.println("3. Add a nickel");
	System.out.println("4. Add a dime");
	System.out.println("5. Add a quarter");
	System.out.println("6. Take money out of my bank");
	System.out.println("0. Quit");
	System.out.println("Enter choice: ");
	
	choice = scanner.nextInt();
	
	switch (choice)
	{
	case 1:
		System.out.printf("Total in bank $%.2f%n", bank.getTotal());
		break;
	case 2:
		bank.addPenny();
		System.out.printf("Penny added.");
		break;
	case 3:
		bank.addNickel();
		System.out.printf("Nickel added.");
		break;
	case 4:
		bank.addDime();
		System.out.printf("Dime added.");
		break;
	case 5:
		bank.addQuarter();
		System.out.printf("Quarter added.");
		break;
	case 6:
		
		System.out.printf("Removed $%.2f from bank.%n", bank.getTotal());
		bank.removeAll(); 
		break;
		
	case 0:
		System.out.printf("Bye!");
		break;
		
	default:
		System.out.printf("Error: invalid input");
		
	}
	
}
		
	scanner.close();
	
	}

}
/*
--- My Savings ---
1. Show total in bank
2. Add a penny
3. Add a nickel
4. Add a dime
5. Add a quarter
6. Take money out of my bank
0. Quit
Enter choice: 
5
Quarter added.
*/