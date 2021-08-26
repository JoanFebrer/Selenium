package exercisesJava.decisions;

import java.util.Scanner;

public class Exercise2 {
	/*
	 * Write a Java program to to find the largest of three numbers.
	 * 
	 * Test Data Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd
	 * number: 87
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Input the 1st number: ");
		int num1 = in.nextInt();

		System.out.print("Input the 2nd number: ");
		int num2 = in.nextInt();

		System.out.print("Input the 3rd number: ");
		int num3 = in.nextInt();
		
		
		if (num1 > num2) {
			if (num1 > num3) {
				System.out.println(num1);
			}
		} else if(num2 > num1) {
			if(num2 > num3) {
				System.out.println(num2);
			}
		} else {
			System.out.println(num3);
		}

	}

}
