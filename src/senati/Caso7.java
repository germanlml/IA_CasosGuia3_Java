package senati;

import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Nombre: ");
		String nombre = scn.nextLine();
		System.out.println("Creciente");
		for(int x = 1; x <= 10; x++) {
			
			System.out.println(x + ". Bienvenido " + nombre + " al curso");
		}
		System.out.println("\nDecreciente");
		for (int i = 10; i >= 1; i -= 2) {
			
			System.out.println(i + ". Bienvenido " + nombre + " al curso");
			
		}
	}

}
