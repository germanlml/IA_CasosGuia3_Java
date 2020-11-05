package senati;

import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int n = 0, i = 1, num_menor = 0;
		System.out.println("==================================");
		System.out.println("====== B I E N V E N I D O =======");
		System.out.println("==================================");

		while (i <= 5) {
			
			System.out.print("Ingrese un número " + i + ": ");
			n = scn.nextInt();
			
			if (i == 1)
				num_menor = n;
			
			if(n < num_menor)
				num_menor = n;
			
			i++;
		}
		System.out.println("==================================");
		System.out.println("----- R E S U L T A D O S --------");
		System.out.println("==================================");
		System.out.println("El número menor es: " + num_menor);
		System.out.println("==================================");

	}

}