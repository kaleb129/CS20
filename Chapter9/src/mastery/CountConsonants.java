/*

Program: CountConsonants.java          Last Date of this Revision: june 4, 2026

Purpose: counts the consonants in a given word


Author: Kaleb
School: CHHS
Course: Computer Programming 20
 

*/
package mastery;


	import java.util.Scanner;

	public class CountConsonants {
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        
	        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
	        
	        System.out.print("Enter text: ");
	        String text = input.nextLine().toLowerCase();
	        
	        int count = 0;
	        
	        for (int i = 0; i < text.length(); i++) {
	            char c = text.charAt(i);
	            
	            if (c >= 'a' && c <= 'z') {          
	                boolean isVowel = false;
	                
	                for (int j = 0; j < vowels.length; j++) {
	                    if (c == vowels[j]) {
	                        isVowel = true;
	                    }
	                }
	                
	                if (!isVowel) {
	                    count++;
	                }
	            }
	        }
	        
	        System.out.println("The number of consonants in " + text + " is " + count);
	    }
	}
/*
Enter text: kaleb
The number of consonants in kaleb is 3

*/

