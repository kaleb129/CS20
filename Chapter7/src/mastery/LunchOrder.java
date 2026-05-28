/*

Program: LunchOrder.java          Last Date of this Revision: May 28, 2026

Purpose: Calculates how much your lunch will cost and gives you nutrition facts about your lunch


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/



package mastery;

import java.util.Scanner;

public class LunchOrder 
	{

	    
	    private int numBurgers;
	    private int numSalads;
	    private int numFries;
	    private int numSodas;

	    
	    public LunchOrder(int numBurgers, int numSalads, int numFries, int numSodas) 
	    {
	        this.numBurgers  = numBurgers;
	        this.numSalads      = numSalads;
	        this.numFries = numFries;
	        this.numSodas       = numSodas;
	    }

	
	    public double getPrice() 
	    {
	        return (numBurgers  * 1.85)
	             + (numSalads      * 2.00)
	             + (numFries * 1.30)
	             + (numSodas       * 0.95);
	    }

	 
	    public double getFat() 
	    {
	        return (numBurgers  * 9.0)
	             + (numSalads      * 1.0)
	             + (numFries * 11.0)
	             + (numSodas       * 0.0);
	    }

	
	    public double getCarbs() {
	        return (numBurgers  * 33.0)
	             + (numSalads      * 11.0)
	             + (numFries * 36.0)
	             + (numSodas       * 38.0);
	    }

	
	    public double getFiber() 
	    {
	        return (numBurgers  * 1.0)
	             + (numSalads      * 5.0)
	             + (numFries * 4.0)
	             + (numSodas       * 0.0);
	    }

	 
	    public static void main(String[] args) 
	    {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of hamburgers: ");
	        int hamburgers = sc.nextInt();

	        System.out.print("Enter number of salads: ");
	        int salads = sc.nextInt();

	        System.out.print("Enter number of french fries: ");
	        int fries = sc.nextInt();

	        System.out.print("Enter number of sodas: ");
	        int sodas = sc.nextInt();

	        sc.close();

	        
	        LunchOrder order = new LunchOrder(hamburgers, salads, fries, sodas);

	        
	        System.out.printf("%nYour order comes to: $%.2f%n", order.getPrice());
	        System.out.printf("Each soda has %.1fg of fat, %.1fg of carbs, and %.1fg of fiber.%n",
	                order.getFat(), order.getCarbs(), order.getFiber());
	    }
	}
/* Enter number of hamburgers: 1
Enter number of salads: 0
Enter number of french fries: 3
Enter number of sodas: 1

Your order comes to: $6.70
Each soda has 42.0g of fat, 179.0g of carbs, and 13.0g of fiber.
*/
