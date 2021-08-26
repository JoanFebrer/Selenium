package exercisesJava.dataTypes;

import java.util.Scanner;

public class Exercise0 {

	public static void main(String[] args) {
		// Write a program that write "Hi NAME" when user write his name
		Scanner in = new Scanner(System.in);
		System.out.println("¿Cómo te llamas?");
		String input1 = in.nextLine();
		System.out.println("Hi " + input1);
	}
}
