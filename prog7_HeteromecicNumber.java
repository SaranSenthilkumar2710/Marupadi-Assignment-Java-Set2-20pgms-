/* 7. Write a program to check whether a number is a Pronic 
Number(Heteromecic Number) or not.*/
package marupadi.Assignment2;

import java.util.Scanner;

public class prog7_HeteromecicNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int input = in.nextInt();
		boolean flag = false;

		for (int i = 0; i < input; i++) {
			if (i * (i + 1) == input) {
				flag = true;
				break;
			}
		}
		if (flag)
			System.out.println("Given Number is a Pronic Number.");
		else
			System.out.println("Given Number is not a Pronic Number.");
	}
}
