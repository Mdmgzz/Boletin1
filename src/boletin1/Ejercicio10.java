package boletin1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//bloque de variables
		int num1,num2;			// seran los tres numeros que vamos a sumar
		int num3; 				// sera el numero a comparar con el resultado de la suma
		int suma;
		// creamos el scanner y solicitamos los 3 numeros
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce el primer numero: ");
		num1=sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		num2=sc.nextInt();
		System.out.println("Introduzca el numero a comparar: ");
		num3=sc.nextInt();
		// sumamos los tres numero y comparamos
		suma = num1+num2;
		if (suma==num3) {
			System.out.print("Los numeros son iguales");
		}else {
			System.out.print("Los numeros NO son iguales");
		}
		sc.close();
	}

}
