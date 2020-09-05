package com.javabasic;

public class TicketsOK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int velocidad = 60;
//		int limiteVelocidad = 100;
//
//		
//		//IF ANIDADOS
//		
//		boolean carretera = true;
//		
//		
//		if (carretera == true) {
//		
//			System.out.println("Vas en carretera");
//			
//			limiteVelocidad = 100; 
//			
//			if (velocidad > limiteVelocidad) {
//				System.out.println("MULTA!!");	
//			}
//			
//			
//		
//		else { 
//			System.out.println("VAS DENTRO DEL RANGO PERMITIDO");
//		
//		}
//		
//		}
//	
		
		//if else if
		
int velocidad = 60;
		int limiteVelocidad = 100;

		
//		
//		boolean carretera = true;
//		
//		
//		if (carretera == false) {
//		
//			System.out.println("Vas en carretera");
//			
//			limiteVelocidad = 100; 
//			
//			if (velocidad > limiteVelocidad) {
//				System.out.println("MULTA!!");	
//			}else { 
//			System.out.println("VAS DENTRO DEL RANGO PERMITIDO");
//			}
//		
//		}else if (velocidad > limiteVelocidad) {
//		System.out.println("Vas en una calle y a exceso de velocidad, MULTA!!");	
//			
//		}else {
//			System.out.println("Vamos en calle pero a velocidad adecuada");
//		}
//		
//
//		  

		
		//SWITCH CASE
		
		int temperatura =40;
		
		switch (temperatura) {
		case 10:
			System.out.println("FRIO");
			 break;
			 
		case 20:
		System.out.println("Agradable");
		break;
		
		case 30:
			System.out.println("Calor");
		break;
		
		case 40:
			System.out.println("Estamos en el desietrto");
			break;
			
			default:
				System.out.println("DA LO MISMO");
				
		}
		
	}

}
