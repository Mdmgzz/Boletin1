package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// bloque de variables
		final int Piedra=1;
		final int Papel=2;
		final int Tijeras=3;
		int jugador1,jugador2;
		// creamos el scanner y solicitamos dos numeros para poder jugar
		Scanner sc=new Scanner (System.in);
		System.out.println("Jugador 1 Elija: PIEDRA(1),PAPEL(2),TIJERAS(3)");
		jugador1=sc.nextInt();
		System.out.println("Jugador 2 Elija: PIEDRA(1),PAPEL(2),TIJERAS(3)");
		jugador2=sc.nextInt();
		// comparamos las elecciones y decidimos ganador
		if (jugador1>3 || jugador1<3) {
			System.out.print("Introduzca valores permitidos");
		}else if(jugador2 > 3 || jugador2 < 3){
			System.out.print("Introduzca valores permitidos");
		}
		if (jugador1 == jugador2 )
			System.out.print("Empate");
		if ((jugador1 == Piedra && jugador2==Tijeras) || (jugador1==Papel && jugador2==Piedra) ||(jugador1==Tijeras && jugador2==Papel) ) {
			System.out.print("Ha ganado el jugador 1");
		}else {
			System.out.print("Ha ganado el jugador 2");
		}
		sc.close();
}
}
