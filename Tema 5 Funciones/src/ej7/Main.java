package ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int tabla[] = {3,3,4,4,4,5, 5};
		int numero;
		final Funcion funcion = new Funcion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es número que desea buscar en la tabla? ");
		numero = sc.nextInt();
		sc.close();
		
		System.out.println(Arrays.toString(funcion.buscarTodos(tabla, numero)));

	}

}
