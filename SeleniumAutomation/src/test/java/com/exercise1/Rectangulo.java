package com.exercise1;

public class Rectangulo extends Poligono{
	
	private double Lado1, Lado2, Lado3, Lado4;
	private double Base, Altura;
	

	// Constructor Default
	public Rectangulo() {
		
	}
	
	//Constructor de Perimetro
	public Rectangulo (double Lado1, double Lado2, double Lado3, double Lado4) {
		super(4);
		this.Lado1 =Lado1;
		this.Lado2 =Lado2;
		this.Lado3 =Lado3;
		this.Lado4 =Lado4;
	}
		//Constructor Area
		
		public Rectangulo (double Base, double Altura){
			super(4);
			this.Base=Base;
			this.Altura=Altura;
	
			
			}
		
		public void setLado1(double Lado1) {
			this.Lado1 =Lado1;
			
					
		}
	
		public double getLado1() {
			return Lado1;
		}
			
		public void setLado2(double Lado2) {
			this.Lado2 =Lado2;
			
					
		}
	
		public double getLado2() {
			return Lado2;
		}
		
		public void setLado3(double Lado3) {
			this.Lado3 =Lado3;
			
					
		}
	
		public double getLado3() {
			return Lado3;
		}
	
		
		public void setLado4(double Lado4) {
			this.Lado4 =Lado4;
			
					
		}
	
		public double getLado4() {
			return Lado4;
		}
	
		
		
	@Override
	
	public String toString() {
	String message = "RECTANGULO " + super.toString()+
			 "\nLADO 1 = " + Lado1 + "LADO 2 = "  + Lado2 + "LADO 3  = " + Lado3 + "LADO 4 = " + Lado4 ;
	return message;
	}

	@Override
	public double area() {
		return Base * Altura/2;
		
	}
	
	@Override
	public double perimetro() {
	
		return Lado1+Lado2+Lado3+Lado4;
	}
		

}
