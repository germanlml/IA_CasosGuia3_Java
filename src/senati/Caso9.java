package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		
		String continuar = "S", nombre = "";
	    float mayor = 0 , menor = 0;
	     
		int num_reg = 0, n1 = 0, n2 = 0, n3 = 0, cert = 0, nocer = 0;
		float asistencia = 0;
		String nombremayor = "";
		String nombremenor = null;
		System.out.println("==================================");
		System.out.println("====== B I E N V E N I D O =======");
		System.out.println("==================================");
		 while (continuar.equals("S")|| continuar.equals("s")) {
			num_reg++;
			System.out.println("==================================");
			System.out.println("      Resgistro de datos " + num_reg);
			System.out.println("==================================");
			
			System.out.print("Nombre del Alumno: ");
			nombre = scn.nextLine();
			System.out.print("Nota 1: ");
			n1 = scn.nextInt();
			System.out.print("Nota 2: ");
			n2 = scn.nextInt();
			System.out.print("Nota 3: ");
			n3 = scn.nextInt();
			System.out.print("Asistencias [1-12]: ");
			asistencia = scn.nextFloat();
			
			float promedio = n1  * 0.2f + n2 * 0.3f + n3 * 0.5f;
			
			float porc_asistencia = asistencia / 12 * 100;
			
			String estado = "";
			
			if (promedio >= 13 && porc_asistencia >= 0.7) {
				estado = "Certificado";cert++;}
			else {
				estado = "Sin Certificado";nocer++;}
			System.out.println("==================================");			
			System.out.println("====== R E S U L T A D O S =======");
			System.out.println("==================================");
			System.out.println("Promedio......: "+ df.format(promedio));
			System.out.println("Asistencia....: "+ df.format(porc_asistencia) + "%" );
			System.out.println("Estado........: "+ estado);
			
			scn.nextLine();
			System.out.println("==================================");
			System.out.print("¿Registrar Otro? [S/N]: ");
			continuar = scn.nextLine();
			System.out.println("==================================");
			if(promedio>mayor)
	        {
	            mayor=(float)promedio;
	            nombremayor = (String)nombre;
	        }
			if(promedio<menor)
	        {
	            menor=(float)promedio;
	            nombremenor = (String)nombre;

	        }
			if (num_reg == 1) {
				mayor = promedio;
				menor = promedio;
			}
	      
		}
		System.out.println("==================================");
		System.out.println("======== R E S U M E N ===========");
		System.out.println("==================================");
		System.out.println("Número de alumnos...................: " + num_reg);
		System.out.println("Mayor promedio......................: " + df.format(mayor) + " pertenece a: " + nombremayor);
		System.out.println("Menor promedio......................: " +  df.format(menor) +" pertenece a: " + nombremenor);
		System.out.println("Número de alumnos certificados......: " + cert );
		System.out.println("Número de alumnos sin certificado...: " + nocer );
	}

}