/* 14. Write a program to get the sum of even numbers and odd number in an 
array. Get the n element as a input, then find the ODD and EVEN numbers kept in 
array and find the sum of the array elements. */
package marupadi.Assignment2;

import java.util.Scanner;

public class prog14_SumOfOddEven {
	public static void main(String[] args) {
		int n;
		Scanner in1 = new Scanner(System.in);
		// Getting Input length of the array
		System.out.print("Enter the length of the Array :");
		n = in1.nextInt();

		// Initialize the array with the given length, and initialize objects to hold the sumValues
		int[] array = new int[n];
		int oddSum=0;
		int evenSum=0;

		// Get the elements one by one and put it in array
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			array[i] = in1.nextInt();
		}
		
		// find the odd number and even number by % operator if returns 0 then the number is even else odd
		// add the odd and even number separately
		for (int i = 0; i < n; i++) {
				if(array[i]%2==0) {
					oddSum=oddSum+array[i];
				
			}else {
				evenSum=evenSum+array[i];
			}
		}
		//Print the result
		System.out.println("Sum of Odd Numbers in the given Array :"+oddSum);
		System.out.println("Sum of Even Numbers in the given Array :"+evenSum);
	}
}
