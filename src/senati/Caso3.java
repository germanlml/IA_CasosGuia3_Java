package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// n = 6
		// Factorial -> 1 * 2 * 3 * 4 * 5 * 6 = 720
		System.out.print("Ingrese un número: ");
		int n = scn.nextInt();
		
		if (n > 0 && n < 8){
			int i = 1, producto = 1;
			System.out.println("\nEl factorial de " + n + " es: ");
			while (i<=n) {
				if (i<n)
					System.out.print(i + " * ");
				producto = producto * i;
				if (i==n)
					System.out.println(i +" = " + producto);
				i++;
				
		}
		}
		else 
			System.out.println("El numero es superior de 7");
	}

}
