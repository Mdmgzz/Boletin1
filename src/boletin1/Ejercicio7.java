package boletin1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// bloque de variables
		int numero; 		//aqui se registra el numero que leeremos
		// creamos el scanner y pedimos al cluente un numero entero
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		numero= sc.nextInt();
		// vamos a comparar el numero con una serie de cifras para saber cuanatas cifras compone al numero
		if (numero < 0 || numero > 999999) {
			System.out.print("Introduzca un valor correcto");
		}else {
			if (numero<=9) {
				System.out.print("El numero tiene una cifra");
			}else if(numero<=99) {
				System.out.print("El numero tiene dos cifras");
			}else if (numero<=999) {
				System.out.print("El numero tiene tres cifras");
			}else if (numero<=9999){
				System.out.print("El numero tiene cuatro cifras");
			}else if(numero<=99999) {
				System.out.print("El numero tiene cincco cifras");
		}
		}
		//cerramos el scanner
		sc.close();
		}

}
