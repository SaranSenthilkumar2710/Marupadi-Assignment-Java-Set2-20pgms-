/* 1. Write a program to check if a number is Armstrong's number or not? */
package marupadi.Assignment2;

import java.util.Scanner;

public class prog1_Armstrong {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Getting input
		System.out.println("Enter the Number :");
		int input = in.nextInt();
		System.out.println("Enter the Order :");
		int order = in.nextInt();
		int lastDigit, power, sum = 0;
		int number = input;

		// Logic : Iterate till number is 0
		// Get the last digit, calculate the power using Math.pow
		// Sum the power of each digit
		// Remove the last digit, by div the number/10
		while (number > 0) {
			lastDigit = number % 10;
			power = (int) Math.pow(lastDigit, order);
			sum = sum + power;
			number = number / 10;
		}

		// if sum is equal to input then the given number is Armstrong
		if (sum == input) {
			System.out.println("Given number is Armstrong!!");
		} else {
			System.out.println("Given number is not Armstrong!!");
		}
	}
}
