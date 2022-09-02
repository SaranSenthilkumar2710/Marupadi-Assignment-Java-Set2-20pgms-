package marupadi.Assignment2;

import java.util.Scanner;

public class prog20_BMI {
	 public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        // Get weight in kilograms
	        System.out.print("Enter your weight in kilograms: ");
	        double weight = sc.nextDouble();
	        // Get height in meters
	        System.out.print("Enter your height in meters: ");
	        double height = sc.nextDouble();
	        // calculate bmi
	        double bmi = weight / (height * height);
	        // Print bmi
	        System.out.println("Your BMI is " + bmi+ " kg/m2");
	    }
}
