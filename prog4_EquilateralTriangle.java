/* 4. Write a program to print equilateral triangle (an equilateral triangle is a 
triangle in which all three sides are equal.) */
package marupadi.Assignment2;

import java.util.Scanner;

public class prog4_EquilateralTriangle {
	public static void main(String[] args) {
		int i, j, n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No of lines for the Equilateral Triangle :");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}
