package exercisesJava.objects;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// INSTANTIATE A HOUSE AND ASSIGN THE VARIABLES

		Scanner in = new Scanner(System.in);
		// DISPLAY THE VARIABLES
		//House house = new House(10,"Juan Gris, 5a", "flat");
		House house = new House();
		System.out.println("Introduce el número de plantas:");
		house.setNPlants(in.nextInt());
		System.out.println("Introduce la dirección:");
		house.setStreet(in.next());
		System.out.println("Introduce flat o house:");
		house.setType(in.next());
		
		house.display();
	}

}
