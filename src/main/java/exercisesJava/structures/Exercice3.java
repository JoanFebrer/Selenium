package exercisesJava.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice3 {

	public static void main(String[] args) {

		// Escribe un programa en java que le pida al usuario cuantos numeros quiere
		// añadir, introduzca los números y los guarde en una lista
		Scanner in = new Scanner(System.in);
		System.out.println("De cuántos números quieres que sea la lista?");
		int size = in.nextInt();
		List<Integer> miLista = new ArrayList<Integer>();
		for (int i = 0; i < size; ++i) {
			miLista.add(in.nextInt());
		}
		
		for (int j = 0; j < miLista.size(); ++j) {
			System.out.println(miLista.get(j));
		}
	}

}
