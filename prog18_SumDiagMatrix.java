/* 18. Write a Program to Compute the Sum of Diagonals of a Matrix. For 
example, for a 2 x 2 matrix, the sum of diagonal elements of the matrix 
{1,2,3,4} will be equal to 5 */
package marupadi.Assignment2;

public class prog18_SumDiagMatrix {
	public static void main(String[] args) {

		// Given Array
		int[][] matrix = { { 1, 2 }, { 3, 4 } };
		int pd = 0;
		for (int k = 0; k < 2; k++) {
			// Inner loop for columns
			for (int l = 0; l < 2; l++) {
				// Condition for the principal diagonal
				if (k == l)
					pd += matrix[k][l];
			}
		}

		// Print and display the sum of primary diagonal
		System.out.println("Sum of Principal Diagonal:" + pd);
	}

}
