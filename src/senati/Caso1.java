package senati;

public class Caso1 {

	public static void main(String[] args) {
		// Aumente de 1 a 5
		System.out.println("\nCreciente");
		System.out.println("===========");
		int i = 1;
		
		while (i <= 5) {
			System.out.println("Mensaje " + i);
			i++;
		}
		
		// Decreciente de 5 a 1
		System.out.println("\nDecreciente");
		System.out.println("===========");
		int j = 5;
		
		while (j >= 1) {
			System.out.println("Mensaje " + j);
			j--;
		}

	}

}
