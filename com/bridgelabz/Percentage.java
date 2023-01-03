package com.bridgelabz;

import java.util.Scanner;

public class Percentage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Your Percentage");
		Scanner sc = new Scanner(System.in);	//using scanner for taking input from user
		double percentage = sc.nextDouble();	//using (double) variable for store data
		if (percentage > 100 || percentage < 0)	
			System.out.println("Invalid Input");
		else if (percentage > 75)	//using if-else ladder for checking condition
			System.out.println("First Class Distiction");
		else if (percentage >= 60 && percentage < 75)
			System.out.println("First Class");
		else if (percentage >= 50 && percentage < 60)
			System.out.println("Second Class");
		else if (percentage >= 35 && percentage < 50)
			System.out.println("Just Passed");
		else
			System.out.println("Sorry! You are failed");

	}

}
