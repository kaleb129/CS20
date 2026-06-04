/*

Program: EvensAndOdds.java          Last Date of this Revision: May 29, 2026

Purpose: Displays 25 random integers between 0 and 99 then separates all the even numbers and odd numbers


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/

package mastery;
import java.util.Random;
public class EvensAndOdds 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int[] numbers = new int[25];
		
		
		for  (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = rand.nextInt(100);
		}

		System.out.print("ODD: ");
		for (int num : numbers) 
		{
			if (num % 2 != 0) 
			{
				System.out.print(num + " ");
			}
		}
		
		System.out.println();
		System.out.print("EVEN: ");
		for (int num : numbers) 
		{
			if (num % 2 <= 0) 
			{
				System.out.print(num + " ");
			}
		}
		System.out.println();
	}

}
/* 
ODD: 9 63 89 67 13 83 23 93 9 87 29 5 
EVEN: 54 62 72 62 96 76 44 40 22 22 46 54 58 
*/