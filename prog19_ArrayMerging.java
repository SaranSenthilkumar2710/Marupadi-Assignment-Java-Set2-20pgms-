/* 9) Given two sorted arrays, merge them such that the elements are not repeated
*/
package marupadi.Assignment2;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class prog19_ArrayMerging {
	public static void main(String[] args) {
		int[] array1 = { 2, 4, 5, 6, 7, 9, 10, 13 };
		int[] array2 = { 2, 3, 4, 5, 6, 7, 8, 9, 11, 15 };
		System.out.println("Given Array1 :");
		System.out.println(Arrays.toString(array1));
		System.out.println("Given Array2 :");
		System.out.println(Arrays.toString(array2));

		int index = 0;
		int num1 = array1.length;
		int num2 = array2.length;

		int num3 = num1 + num2;
		Integer[] array3 = new Integer[num3];

		for (int i = 0; i < array1.length; i++) {
			array3[index] = array1[i];
			index++;
		}
		for (int i = 0; i < array2.length; i++) {
			array3[index] = array2[i];
			index++;
		}

		// Create linkedHashSet to avoid duplicates from the merged array
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array3));

		// convert the set into array without duplicates
		Integer[] resultArray = linkedHashSet.toArray(new Integer[] {});

		// Sort the array
		Arrays.sort(resultArray);

		// Print the resultant array
		System.out.println("Merged Array :");
		System.out.println(Arrays.toString(resultArray));
	}
}
