package exercisesJava.dataTypes;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un número");
		String input1 = in.nextLine();
		System.out.println("Introduce un segundo número");
		String input2 = in.nextLine();
		int a = Integer.parseInt(input1);
		int b = Integer.parseInt(input2);
		System.out.println("La suma de " + input1 + " y " + input2 + " es " + (a + b));
		System.out.println("La multiplicación de " + input1 + " y " + input2 + " es " + (a*b));
		System.out.println("La resta de " + input1 + " y " + input2 + " es " + (a - b) );
		System.out.println("La división de " + input1 + " y " + input2 + " es " + (a/b) );
		System.out.println("El módulo de " + input1 + " y " + input2 + " es " + (a % b) );
	}

}
