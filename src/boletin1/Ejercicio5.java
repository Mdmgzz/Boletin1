package boletin1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// bloque de variables 
		double num1,num2,num3; 			//se guardaran los dos numeros
		double pos1=0 ,pos2=0, pos3=0;			// se van guardando los numeros 
		//creamos el scanner y preguntamos
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		num1= sc.nextDouble();
		System.out.print("Introduzca un numero: ");
		num2= sc.nextDouble();
		System.out.print("Introduzca un numero: ");
		num3= sc.nextDouble();
		// comprobamos cual es el mayor para ordenarlos
		if(num1>num2 && num2>num3){
			pos1=num1;
			pos2=num2;
			pos3=num3;
			
		} else if(num1>num3 && num3>num2){
			pos1=num1;
			pos2=num3;
			pos3=num2;
		}else if(num2>num1 && num1>num3) {
			pos1=num2;
			pos2=num1;
			pos3=num3;
		}else if(num2>num3 && num3>num1) {
			pos1=num2;
			pos2=num3;
			pos3=num1;
		}else if(num3>num2 && num2>num1) {
			pos1=num3;
			pos2=num2;
			pos3=num1;
		}else if (num3>num2 && num1>num2) {
			pos1=num3;
			pos2=num1;
			pos3=num2;
		}	
		System.out.print("El orden es el siguiente: "+ pos1 + " , " + pos2 + " , " + pos3);
		//cerramos el scanner
		sc.close();
	}

}