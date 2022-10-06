package boletin1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// bloque de variables 
		double num1,num2; 			//se guardaran los dos numeros
		//creamos el scanner y preguntamos
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		num1= sc.nextDouble();
		System.out.print("Introduzca un numero: ");
		num2= sc.nextDouble();
		// comprobamos cual es el mayor para ordenarlos
		if(num1>num2){
			System.out.print("El orden es el siguiente: "+ num1+" , "+num2);
		}else if(num1==num2) {
			System.out.print("LOS NUMEROS SON IGUALES");
		}else {
			System.out.print("El orden es el siguiente: "+ num2+" , "+num1);
		}
		//cerramos el scanner
		sc.close();
	}

}
