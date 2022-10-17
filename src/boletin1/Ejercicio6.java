package boletin1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Bloque de variables
		int a,b,c;		//seran los tres valores para realizar la op
		double raiz;	//aqui se guarda la operacion de la raiz
		double x1,x2;	// guadarems los dos resultados
		// creamos scanner y solicitamos los 
		Scanner sc= new Scanner(System.in);
		System.out.print("Introduzca el valor de a: ");
		a = sc.nextInt();
		System.out.print("Introduzca el valor de b: ");
		b = sc.nextInt();
		System.out.print("Introduzca el valor de c: ");
		c = sc.nextInt();
		// vamos a realizar la operacion
		raiz=b*b-4*a*c;
		if (raiz<0) {
			System.out.print("No hay solucion");
		}else if (a==0) {						// si la variable a es = 0 se convertiria en eq de 1º grado
			x1=c/b;
		}else {
			x1=(-b+Math.sqrt(raiz)/2*a);
			x2=(-b-Math.sqrt(raiz)/2*a);
			System.out.print("El primer resultado es: "+ x1 + "El segundo resutado es: "+ x2);
		}
		// cerramos el scanner 
	sc.close();
	}
	

}
