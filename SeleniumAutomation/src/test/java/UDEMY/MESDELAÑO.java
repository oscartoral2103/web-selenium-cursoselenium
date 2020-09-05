package UDEMY;

import java.util.Scanner;

public class MESDELAÑO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mes =Integer.parseInt("4");
		Scanner consola = new Scanner (System.in);
		System.out.println("Me indicas el mes que deseas consultar");
		mes = Integer.parseInt(consola.nextLine());
		
		String estacion ="Estacion desconocida" ;
		if (mes == 1 || mes == 2 || mes ==12) {
			estacion ="Invierno";
			System.out.println(estacion);
		}
		else if (mes == 3 || mes == 4 || mes == 5) {
			estacion= "Primavera";
					System.out.println(estacion);
					}
		else if(mes == 6 || mes == 7) {
		estacion ="Verano";
		System.out.println(estacion);
		}
		else if(mes == 8 || mes == 9 || mes ==10 || mes ==11) {
			estacion ="OTOÑO";
			System.out.println(estacion);
			}
		
		
		
	}

}
