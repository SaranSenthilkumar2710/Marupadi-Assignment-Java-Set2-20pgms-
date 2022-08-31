/* 16. Write a program for Split a String into a Number of Substrings. Get a 
string as a input and then split as a substring */
package marupadi.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class prog16_SplitString {
	public static void main(String args[]) {
		// Getting Input String
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();

		// Split the input string using split method with space and put it in temp array
		String[] temp = str.split("\\s+");

		// Print the resultant array
		System.out.println("Splitted Strings :");
		System.out.println(Arrays.toString(temp));
	}
}
