package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		
        System.out.print("Introduce un número entero: ");                                                         
        int n = scn.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=15; i++){
             System.out.println(n + " * " + i + " = " + n*i);

}
}

	}


