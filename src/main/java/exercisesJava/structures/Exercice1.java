package exercisesJava.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercice1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		// Declaro mi lista
		List<String> miLista = new ArrayList<String>();
		
		// Obtengo los valores
		System.out.println("Introduce una palabra");
		String input1 = in.next();
		System.out.println("Introduce una palabra");
		String input2 = in.next();
		System.out.println("Introduce una palabra");
		String input3 = in.next();
		
		// Añadir a la lista
		miLista.add(input1);
		miLista.add(input2);
		miLista.add(input3);
		
		// Mostrar los resultados
		System.out.println("Los elementos de la lista son:");
		System.out.println(miLista.get(0));
		System.out.println(miLista.get(1));
		System.out.println(miLista.get(2));

		
		
		
		
		

	}

}
