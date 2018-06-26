package hayes_18;

import java.util.Scanner;

public class Exercise18_Extra {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two doubles in descending order: ");
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();

		// System.out.println(recursiveDivision(num1,num2));
		System.out.println("This is how many times num2 can be divided into num1: " + recursiveDivision(num1, num2));

	}

	private static int recursiveDivision(double num1, double num2) {

		if (num1 < num2)
			return 0; // base case

		else
			return 1 + recursiveDivision(num1 - num2,num2); // recursive call

	}

}
