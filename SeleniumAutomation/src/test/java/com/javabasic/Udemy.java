package com.javabasic;

public class Udemy {

	public static void main(String args[]) {
//		//System.out.println("Hola Mundo desde Java");
//		//DEFINIMOS LA VARIABLE
//		int VariableEntera =10;
//		System.out.println(VariableEntera);
//		
//		//modificamos el valor de la variable
//		VariableEntera=5;
//		
//		System.out.println(VariableEntera);
//		
//		String VariableCadena = "Saludos";
//		System.out.println(VariableCadena);
//		
//		VariableCadena ="Adios";
//		System.out.println(VariableCadena);
//		
//		

		String usuario = "Juan";
		String titulo = "Ingeniero";
		String Union = titulo + " " + usuario;
		System.out.println("Union = " + Union);

		int Num1 = 15;
		int Num2 =10;
		System.out.println(Num1 + Num2);//Se realiza la suma de Numeros
		
		System.out.println(Num1 + Num2 + usuario);//Evaluacion de izquierda a derecha realiza suma
		System.out.println(usuario + (Num2 + Num1));//Se realiza la suma por el parentesisi, sin este, pinta los valores de Num1 y Num2
		
		
		
		
		
	}

}
