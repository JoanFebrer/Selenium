package exercisesJava.decisions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// Write a Java program to get a number from the user and print whether it is
		// positive or negative
		Scanner in = new Scanner(System.in);
		System.out.println("¿Quieres introducir números o texto?: ");
		System.out.println("1. Números");
		System.out.println("2. Texto");
		int type = in.nextInt();
		if (type == 1) {
			List<Integer> myList = new ArrayList<Integer>();
			System.out.println("¿Quieres definir un tamaño máximo?");
			System.out.println("Si/No");
			String max = in.next();
			int size = 100000000;
			if (max.equalsIgnoreCase("Si")) {
				System.out.println("¿Cuántos números quieres introducir?");
				size = in.nextInt();
				int i = 0;
				while (i < size) {
					myList.add(in.nextInt());
				}
			}
			else {
				System.out.println("-1 para finalizar");
				int i = 0;
				while (i < size) {
					int num = in.nextInt();
					if (num == -1) {
						break;
					}
					myList.add(num);
				}
			}
			System.out.println("Los números introducidos son:");
			for(int j = 0; j < myList.size(); ++j) {
				System.out.println(myList.get(j));
			}
			
		} else if(type == 2) {
			List<String> myList = new ArrayList<String>();
		} else {
			System.out.println("ERROR. Por favor, introduce un valor válido.");
			System.out.println("1. Números");
			System.out.println("2. Texto");
		}
		
	}
	
}
