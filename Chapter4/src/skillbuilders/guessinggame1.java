package skillbuilders;

import java.util.Random;
import java.util.Scanner;

public class guessinggame1 {

	public static void main(String[] args) 
		

	{
		
		Scanner input = new Scanner(System.in);
		
		Random random = new Random();
		
		//Game Setup
		int secretNumber = random.nextInt(30) + 1;
		
		//Output
		System.out.println("Guess a number (1-30):");
		System.out.println("Your guess: ");
		
		//Single Input
		int guess = input.nextInt();
	
	}

}