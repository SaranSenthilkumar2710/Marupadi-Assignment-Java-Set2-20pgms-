/*  Find the fourth highest number in given array? You are given an array 
consisting of 'N' integers. You have to find the fourth largest element present 
in the array. */
package marupadi.Assignment2;

import java.util.Arrays;
import java.util.Scanner;

public class prog13_4thLargestElement {
	public static void main(String[] args) {
		int n;
		Scanner in1 = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the length of the Array :");

		n = in1.nextInt();
		// Initialize the array with the given length
		int[] array = new int[n];
		System.out.println("Enter the elements of the array: ");
		// Get the elements one by one and put it in array
		for (int i = 0; i < n; i++) {
			array[i] = in1.nextInt();
		}
		Arrays.sort(array);
		// find the largest element using max method of Arrays class

		System.out.println("4th Largest element of the array :  " + array[3]);

	}
}
