package boletin1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Bloque de variables
		int numero,resultado;				//el numero que se va a introducir para ver si es par o no
		// creamos el scanner para leer el numero
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		numero=sc.nextInt();
		resultado=numero%2;
		if (resultado == 0) {
			System.out.print("El numero es par");
		} else {
			System.out.print("El numero es impar");
		}
		sc.close();
		}

	}

