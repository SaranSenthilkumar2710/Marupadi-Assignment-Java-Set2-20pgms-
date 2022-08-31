/* 17. Write a Program to Replace Multiple Characters in a String.
Get a string as a input and replace multiple characters from the original string,
Ex: Input:- Graduate study (replace 'a' with 'b') */
package marupadi.Assignment2;

import java.util.Scanner;

public class prog17_ReplaceChar {
	public static void main(String args[]) {
		// Getting Input String
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = input.nextLine();
		System.out.println("Enter Character to replace: ");
		String c = input.next();
		System.out.println("Enter new Character : ");
		String c1 = input.next();
		// Using replace to replace characters
		System.out.print("After replacing " + c + " with " + c1 + ":");
		System.out.println(str.replace(c, c1));

	}
}
