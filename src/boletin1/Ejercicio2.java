package boletin1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// bloque de variables
		int num1,num2;			//seran los numeros que vamos a comparar
		//creamos el Scanner y solicitamos al usuario los numeros
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		num1=sc.nextInt();
		System.out.print("Introduzca un numero: ");
		num2=sc.nextInt();
		// ya hemos guardado los numeros en las variables
		//vamos a compararlos con if
		if (num1==num2) {
			System.out.print("SON IGUALES");
		} else {
			System.out.print("SON DIFERENTES");
		}
		sc.close();
	}

}
