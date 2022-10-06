package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// bloque de variables
		double num1;				// se regustra el numero introducido por el cliente
		// creamos el scanner y preguntamos al cliente
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		num1= sc.nextDouble();
		// comparamos si el numero es casi cero o no
		if (num1<1 && num1!=0 && num1>-1) {
			System.out.print("EL NÚMERO ES CASI-CERO");
		}else {
			System.out.print("EL NÚMERO NO ES CASI-CERO");
		}
		//cerramos el scanner
		sc.close();
		}
}

