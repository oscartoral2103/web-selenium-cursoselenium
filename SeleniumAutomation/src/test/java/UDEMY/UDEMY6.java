package UDEMY;

import java.util.Scanner;

public class UDEMY6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SENTENCIA SWITCH
		
//		int numero =Integer.parseInt("100");
//		String numeroTexto = "Numero DESCONOCIDO";
//		Scanner consola = new Scanner (System.in);
//		System.out.println("Indica por favor el numero que quiere validar");
//		numero = Integer.parseInt(consola.nextLine());
//	switch (numero) {
//		case 1:
//			numeroTexto = "NUMERO 1";
//			break;
//			
//		case 2:
//			numeroTexto = "NUMERO 2";
//			break;
//			
//		case 3:
//			numeroTexto = "NUMERO 3";
//			break;
//			
//		case 4:
//			numeroTexto = "NUMERO 4";
//			break;
//		}
//		System.out.println("El numero es: " + numeroTexto);
//		
		
//ESTCAION DEL AÑO CON SWITCH
		
		int mes =Integer.parseInt("1");
		String estacion = "ESTACION DESCONOCIDA";
		Scanner consola = new Scanner (System.in);
		System.out.println("QUE ESTACION QUIERES COMPROBAR");
		mes = Integer.parseInt(consola.nextLine());
	
		switch (mes) {
		case 1: case 12: case 2:
			estacion = "INVIERNO";
			break;
			
		case 3: case 4: case 5:
			 estacion = "PRIMAVER";
			break;
			
		case 6: case 7: case 8: 
			estacion = "VERANO";
			break;
			
		case 9: case 10: case 11:
			estacion = "OTOÑO";
			break;
		}
		System.out.println("La estacion es:  " + estacion);
	
	}

}
