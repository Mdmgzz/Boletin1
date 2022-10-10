package boletin1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// bloque de variables
		double numero; 		//se guarda el numero para comprobar la nota
		// creamos el Scanner y pedimos al usuario un numero real
		Scanner sc=new Scanner (System.in);
		System.out.println("INTRODUZCA UNA NOTA: ");
		numero=sc.nextInt();
		// antes de comparar nos aseguramos que el numero esta entre 0-10
		if (numero>=11 || numero<=-1) {
			System.out.println("LOS VALORES INTRODUCIDOS NO SON CORRECTOS");
		} else if (numero<5 && numero>=0) {
			System.out.println("INSUFICIENTE");
		}else if(numero<6 && numero>=5) {
			System.out.println("SUFICIENTE");
		}else if(numero<7 && numero>=6) {
			System.out.println("BIEN");
		}else if(numero<9 && numero>=7) {
			System.out.println("NOTABLE");
		}else if(numero<=10 && numero>=9) {
			System.out.println("SOBRESALIENTE");
		}
	sc.close();
	}

}
