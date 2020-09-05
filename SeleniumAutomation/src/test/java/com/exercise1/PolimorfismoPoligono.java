package com.exercise1;

public class PolimorfismoPoligono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//NUESTRO OBJETO POLIGONO 
		
		Poligono poligono1 = new Rectangulo(4,4,2,2);
		System.out.println(poligono1.toString());
		double perimetro1 = poligono1.perimetro();
		System.out.println("El perimietro de este figura es: " + perimetro1);
		
		poligono1 = new Rectangulo (2,2);
		double area1 =poligono1.area();
		System.out.println("El area de esta figura es: " + area1);
		
		poligono1 = new Triangulo (3,3,3);
		System.out.println(poligono1.toString());
		double perimetro2 = poligono1.perimetro();
		System.out.println("El perimietro de este figura es: " + perimetro2);
		
		poligono1 = new Triangulo (5,2);
		double area2 =poligono1.area();
		System.out.println("El area de esta figura es: " + area2);

	}

}
