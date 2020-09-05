package com.exercise1;

public abstract class Poligono {

	private int numlados;
	
	//Constructor
	public Poligono() {
		
	}
	
	//Constructor lados
	
	public Poligono (int numlados) {
		this.numlados = numlados;
		
	}
// Encapsular Getter y Setter
	
	public void setnumLados(int numlados) {
		this.numlados=numlados;
	}
	public int getnumLados() {
		return numlados;
		
	}

	// NUMERO DE LADOS
	@Override
	public String toString() {
		return "Numero de lados: " + numlados;
			}
	
	//METODO DE ABSTRACCION
	
	public abstract double area();
	public abstract double perimetro();

	public double area1() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
