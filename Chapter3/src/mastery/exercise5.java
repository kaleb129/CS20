package mastery;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("==============================");
	        System.out.println("--- COIN CHANGE CALCULATOR ---");
	        System.out.println("==============================");

	        while (true) {
	            System.out.print("\nEnter amount (0 - 99 cents), or 'q' to quit: ");
	            String input = scanner.nextLine().trim();

	            if (input.equalsIgnoreCase("q")) {
	                System.out.println("Goodbye!");
	                break;
	            }

	            int amount;
	            try {
	                amount = Integer.parseInt(input);
	            } catch (NumberFormatException e) {
	                System.out.println("Error: Please enter a whole number between 0 and 99.");
	                continue;
	            }

	            if (amount < 0 || amount > 99) {
	                System.out.println("Error: Amount must be between 0 and 99 cents.");
	                continue;
	            }

	            if (amount == 0) {
	                System.out.println("No change needed.");
	                continue;
	            }

	            int quarters = amount / 25;
	            amount %= 25;

	            int dimes = amount / 10;
	            amount %= 10;

	            int nickels = amount / 5;
	            amount %= 5;

	            int pennies = amount;

	            int totalCoins = quarters + dimes + nickels + pennies;

	            System.out.println("\n------------------------------");
	            System.out.printf("  Quarters : %d%n", quarters);
	            System.out.printf("  Dimes    : %d%n", dimes);
	            System.out.printf("  Nickels  : %d%n", nickels);
	            System.out.printf("  Pennies  : %d%n", pennies);
	            System.out.println("------------------------------");
	            System.out.printf("  Total coins: %d%n", totalCoins);
	            System.out.println("------------------------------");
	        }

	        scanner.close();
	    }

	

}
