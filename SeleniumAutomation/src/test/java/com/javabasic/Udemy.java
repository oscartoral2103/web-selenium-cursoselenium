package com.javabasic;

import java.util.Scanner;

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
//
//		String usuario = "Juan";
//		String titulo = "Ingeniero";
//		String Union = titulo + " " + usuario;
//		System.out.println("Union = " + Union);
//
//		int Num1 = 15;
//		int Num2 =10;
//		System.out.println(Num1 + Num2);//Se realiza la suma de Numeros
//		
//		System.out.println(Num1 + Num2 + usuario);//Evaluacion de izquierda a derecha realiza suma
//		System.out.println(usuario + (Num2 + Num1));//Se realiza la suma por el parentesisi, sin este, pinta los valores de Num1 y Num2
//		
//		
//		
//		String Nombre = "karla";
//		System.out.println("Nueva Linea: \n" + Nombre);//SALTO DE LINEA
//		System.out.println("Tabulador: \t" + Nombre);//UN TABULADOR--ESPACIO
//		System.out.println("Retroceso: \b\b" + Nombre); //Retrocceso
//		System.out.println("Comilla Simple: \'" + Nombre + "'");//Comilla Simple
//		System.out.println("Comilla Doble: \"" + Nombre +"\"");//Comilla Doble
//		
//		
		System.out.println("Escribe tu nombre");
		Scanner Consola = new Scanner(System.in);
		String Usuario =Consola.nextLine();
				System.out.println("Usuario = " + Usuario);
				System.out.println("Escribe el Titulo");
				String Titulo =Consola.nextLine();
				System.out.println("Resultado: " + Titulo + " " + Usuario);
		
		
		
	}

}
