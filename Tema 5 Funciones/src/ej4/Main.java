package ej4;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int longitud;
		final Funcion funcion = new Funcion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es la longitud para la tabla deseada? ");
		longitud = sc.nextInt();
		sc.close();
		
		System.out.println(Arrays.toString(funcion.sinRepetidos(longitud)));

	}

}
