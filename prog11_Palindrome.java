/* 11. Check if a given number is palindrome or not. */
package marupadi.Assignment2;

import java.util.Scanner;

public class prog11_Palindrome {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Getting input
		System.out.println("Enter the Number :");
		int input = in.nextInt();
		
		int lastDigit, reverse=0, sum = 0;
		int number = input;

		// Logic : Iterate till number is 0
		// Get the last digit, 
		// calculate the reverse by multiplying it with 10 and adding last digit
		// Remove the last digit, by div the number/10
		while (number > 0) {
			lastDigit = number % 10;
			reverse = reverse * 10 + lastDigit;
			number = number / 10;
		}
		System.out.println(input);
		// if reverse is equal to input then the given number is Palindrome
		if (reverse == input) {
			System.out.println("Given number is Palindrome!!");
		} else {
			System.out.println("Given number is not Palindrome!!");
		}
	}
}
