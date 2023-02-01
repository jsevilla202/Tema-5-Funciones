package ej4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int valor;
		int tabla[] = {3,3,4,4,4,5, 5};
		final Funcion funcion = new Funcion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es valor que desea buscar en la tabla? ");
		valor = sc.nextInt();
		
		sc.close();
		
		System.out.println("La posición del número introducido es "+funcion.buscar(tabla, valor));


	}

}
