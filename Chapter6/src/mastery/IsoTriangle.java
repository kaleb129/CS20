/*

Program: IsoTriangle.java          Last Date of this Revision: May 20, 2026

Purpose:	Creates a triangle shape, the number the user inputs determines the size of the triangle
Author: 	Kaleb Nieboer
School:		CHHS
Course: 	Computer Science 20
 

*/

package mastery;

import java.util.Scanner;

public class IsoTriangle 

{ 


    
    public static String addSpaces(int count) 
    {
        String spaces = "";
        for (int i = 0; i < count; i++) 
        {
            spaces += ""
            		+ " ";
        }
        return spaces;
    }
    
    public static void drawBar(int stars, int spaces) 
    {
        System.out.println(addSpaces(spaces) + "*".repeat(stars));
    }
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size: ");
        int size = scanner.nextInt();
        
       
        for (int row = 1; row <= size; row++) // makes the dots into triangle shape 
        {
            int stars = (row * 2) - 1;
            int spaces = size - row;
            drawBar(stars, spaces);
        }
        
        scanner.close();
    }
}

/*
  
  Enter the size: 13
            *
           ***
          *****
         *******
        *********
       ***********
      *************
     ***************
    *****************
   *******************
  *********************
 ***********************
*************************
 
 */



