package senati;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		int num_emp = 0, can = 0;
		String continuar = "S",nombremayor = "", nombremenor = "", nombretard = "";
		float mayor = 0, menor = 0, min_tard = 0, minutos = 0;
		System.out.println("==================================");
		System.out.println("====== B I E N V E N I D O =======");
		System.out.println("==================================");
		while (continuar.equals("S")||continuar.equals("s")) {
			num_emp++;
			System.out.println("==================================");
			System.out.println("      Resgistro de datos " + num_emp);
			System.out.println("==================================");
			
			System.out.print("Empleado...........: ");
			String emp = scn.nextLine();
			System.out.print("Horas trabajadas...: ");
			float horas = scn.nextFloat();
			System.out.print("Tarifa.............: ");
			float tarifa = scn.nextFloat();
			System.out.print("Minutos de tardanza: ");
			minutos = scn.nextFloat();
			
			float sueldo_bruto = horas * tarifa;
			
			float bono = 0;
			if (horas >50 && horas <= 60)
				bono = sueldo_bruto * 0.02f;
			else if(horas > 60 && horas <= 70)
				bono = sueldo_bruto * 0.08f;
			else if (horas > 70 && horas <= 80)
				bono = sueldo_bruto * 0.13f;
			else if (horas > 80)
				bono = sueldo_bruto * 0.15f;
			
			float desct = 0;
			if (minutos > 15 && minutos <=30)
				desct = sueldo_bruto * 0.003f * minutos;
			if (minutos > 30)
				desct = sueldo_bruto * 0.005f * minutos;
			
			float sueldo_neto = sueldo_bruto + bono - desct;
			
			float porcent = 100;
			if (horas <= 80)
				porcent = horas / 80 * 100;
			
			if (num_emp == 1) {
				mayor = sueldo_neto;
				menor = sueldo_neto;
			}
				
			
			System.out.println("==================================");			
			System.out.println("====== R E S U L T A D O S =======");
			System.out.println("==================================");
			System.out.println("Sueldo bruto........: " + df.format(sueldo_bruto));
			System.out.println("Bonificacions.......: " + df.format(bono));
			System.out.println("Descuento...........: " + df.format(desct));
			System.out.println("Sueldo neto.........: " + df.format(sueldo_neto));
			System.out.println("% Alcanzado.........: " + df.format(porcent) + "%");
			
			scn.nextLine();
			System.out.println("==================================");
			System.out.print("¿Registrar Otro? [S/N]: ");
			continuar = scn.nextLine();
			System.out.println("==================================");
			
			if( sueldo_neto > mayor)
	        {
	            mayor= sueldo_neto;
	            nombremayor = emp;
	        }
			if(sueldo_neto < menor)
	        {
	            menor= sueldo_neto;
	            nombremenor = emp;
	        }
			if( minutos > min_tard)
	        {
				min_tard= minutos;
	            nombretard = emp;
	        }
			
			if (porcent > 90)
				can++;
		}
		System.out.println("==================================");
		System.out.println("======== R E S U M E N ===========");
		System.out.println("==================================");
		System.out.println("Números de empleados....: "+ num_emp);
		System.out.println("Sueldo neto mayor.......: " + df.format(mayor) + " pertenece a: " + nombremayor);
		System.out.println("Sueldo neto menor.......: " +  df.format(menor) +" pertenece a: " + nombremenor);
		System.out.println("Empleado con la mayor cantidad de min de tardanza: "+ nombretard + " (" + minutos + " min.)" );
		System.out.println("Cantidad de empleados con mas del 90% de la meta.: " + can);
		
	}
			

	
}