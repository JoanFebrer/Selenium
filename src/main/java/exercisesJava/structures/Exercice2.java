package exercisesJava.structures;

import java.util.Scanner;

public class Exercice2 {

	public static void main(String[] args) {

		// Escribe un programa en java que le pida al usuario que cambie el contenido de
		// una posición de la siguiente lista

		int my_array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Scanner in = new Scanner(System.in);
		System.out.println("Que posición quieres cambiar? (1-10) ");
		int pos = in.nextInt();
		System.out.println("La posición " + pos + " tiene el valor: " + my_array[pos-1] + " por qué valor quieres cambiar?");
		int value = in.nextInt();
		my_array[pos-1] = value;
		for (int i = 0; i < my_array.length; ++i) {
			System.out.println(my_array[i]);
		}
		
	}

}
