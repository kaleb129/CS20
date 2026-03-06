
package mastery;

import java.util.Scanner;

public class exercise5 


{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of change in cents: ");
        int change = input.nextInt();

        int quarters = change / 25;
        change = change % 25;

        int dimes = change / 10;
        change = change % 10;

        int nickels = change / 5;
        change = change % 5;

        int pennies = change; 
        
        int Totalcoins = quarters + dimes + nickels + pennies;

        System.out.println("The minimum number of coins is:" + Totalcoins);
        System.out.println("Amount of quarters: " + quarters);
        System.out.println("Amount of dimes: " + dimes);
        System.out.println("Amount of nickels: " + nickels);
        System.out.println("Amount of pennies: " + pennies);
    }
}
