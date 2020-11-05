package senati;

import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Ingrese un número: ");
		int n = scn.nextInt();
		
		int i = 1, suma = 0;
		
		while (i<=n) {
			if (i<n)
				System.out.print(i + " + ");
			suma += i;
			if (i==n)
				System.out.println(i +" = " +suma);
			i++;
			
			
		}
		
		//System.out.println("   Resultados   ");
		//System.out.println("=================");
		//System.out.println("La sumatoria es: " + suma);
		
	}

}
