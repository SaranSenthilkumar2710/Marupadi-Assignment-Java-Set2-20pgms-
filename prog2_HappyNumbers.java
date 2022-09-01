package marupadi.Assignment2;

import java.util.Scanner;
import java.util.*;

public class prog2_HappyNumbers {
	
	
	public static int checkHappyNumber(int number)
	{
	int rem = 0,sum = 0;
	// calculate the sum of squares of digits
	while(number >0)
	{
	rem = number%10;
	sum = sum + (rem*rem);
	number = number/10;
	}
	return sum;
	}
	public static void main(String[] args)
	{
	// Take starting and ending number from keyboard
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter the range number to print happy numbers :");
	int j=sc.nextInt();
	System.out.println("The happy numbers till "+1+" and "+j+" are: ");
	for (int x=1 ; x <= j; x++)
	{
	int result = x;
	//Happy number always ends with 1 and unhappy number ends with 4
	while(result != 1 && result != 4)
	{
	result = checkHappyNumber(result);
	}
	if(result == 1)
	System.out.print(x + ",");
	}
	}
	}