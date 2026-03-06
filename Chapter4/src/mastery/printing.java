package mastery;

import java.util.Scanner;

public class printing 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int copies;
        double pricePerCopy = 0.0;
        double totalPrice;

        System.out.print("Enter the number of copies to print: ");
        copies = input.nextInt();

        
        if (copies >= 1 && copies <= 99) 
        {
            pricePerCopy = 0.30;
        } else if (copies <= 499) 
       
        {
            pricePerCopy = 0.28;
        } else if (copies <= 749) 
       
        {
            pricePerCopy = 0.27;
        } else if (copies <= 1000) 
        
        {
            pricePerCopy = 0.26;
        } else 
        
        {
            pricePerCopy = 0.25;
        }

        totalPrice = copies * pricePerCopy;

        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total price: $" + totalPrice);

       
    }
}  

