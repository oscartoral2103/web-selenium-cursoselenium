package com.javabasic;

public class Tickets {

	
	int precioAdulto, edad;
	double precioNino, precioEstudiante;
	boolean estudiante = false;
	String costo;
	
	
	/************************************************************************************CONSTRUCTOR*/
	public Tickets(int precioNormal, int edadPersona, boolean credencialEstudiante) {
		
		precioAdulto = precioNormal;
		precioNino = precioNormal *(.85);
		precioEstudiante = precioNormal * (.5);
		costo = "Precio Normal";
		edad= edadPersona;
		estudiante = credencialEstudiante;
	}
	
	
		
		/*******************************************************************************METODO*/
		
		public void costoDia() {
			System.out.println("El costo Ticket: "+ costo);
			
			
		}
		
		public void precioAdulto() {
			System.out.println("Ticket Adulto: $"+ precioAdulto);
			
					
		}
		
		public void precioNino() {
			System.out.println("Ticket Nino: $"+ precioNino);
						
			
		}
		
		public void precioEstudiante() {
			System.out.println("Ticket Estudiante: $"+ precioEstudiante);
		}
		
	public void verificarcostoTicket() {
		if (estudiante==true) {
			System.out.println("Eres estudiante, el precio de tu ticket es: "+precioEstudiante);
		}else if (edad>18) {
			System.out.println("Eres Adulto, el precio de tu ticket es: " +precioAdulto );
			
		}else {
			System.out.println("Eres NINO, el precio de tu ticket es: "+precioNino);
							
			
			}
	}
	/**********************************************************************************SOBRECARGA*/
	
	public double sumarTicket() {
		double suma = precioAdulto + precioNino;
		System.out.println(suma);
		return suma;
		
			
	}
	
	public double sumarTicket(int descuento) {
		double suma = (precioAdulto + precioNino) - descuento;
		System.out.println(suma);
		return suma;
	}
		
	public double sumarTicket(int descuento int descuentoExtra) {
		double suma = (precioAdulto - precioNino)- 30 - 30;
		System.out.println(suma);
		return suma;
		
	
	}
	
	public double sumarTicket(boolean descuento int descuentoExtra) {
		double suma = (precioAdulto - precioNino) - 30 - 30;
		System.out.println(suma);
		return suma;
	
	}
	
	//EJERCICIO GENERAR OTRO CONSUTRUCTOR
	
	
	public static void main (String[] args) {
		
		Tickets tickets = new Tickets(100, 19, true);
		
		tickets.costoDia();
		tickets.precioAdulto();
		tickets.precioNino();
		tickets.precioEstudiante();
		
	
						
			
		}
	}
	
	
	
