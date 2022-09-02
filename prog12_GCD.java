package marupadi.Assignment2;

import java.util.Scanner;

public class prog12_GCD {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Get the first input
		System.out.print("Enter the first number : ");
		int num1 = in.nextInt();
		// Get the second input
		System.out.print("Enter the second number : ");
		int num2 = in.nextInt();
		int GCD = 1, i;

		// loop for iteration to find the GCD of both numbers
		for (i = 1; i <= num1 && i <= num2; i++) {
			 // Check the modulation with both numbers with Iteration values
			if (num1 % i == 0 && num2 % i == 0) {
				// Replace the GCD value with the higher Iteration value
				GCD = i;
			}
		}
		System.out.print("GCD of " + num1 + " and " + num2 + " : " + GCD);
		System.out.print("\nSum of digits of first number : " + sum(num1));

		System.out.print("\nSum of digits of second number : " + sum(num2));
	}

	public static int sum(int num) {
		int reminder = 0;
		int sum = 0;

		while (num > 0) {
			reminder = num % 10;
			sum = sum + reminder;
			num = num / 10;
		}
		return sum;
	}
}
