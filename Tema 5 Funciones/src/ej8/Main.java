package ej8;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int tabla[] = {10, 1, 5, 8, 9, 2};
		int numero;
		final Funcion funcion = new Funcion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cuantos numeros consecutivos desea sumar ? ");
		numero = sc.nextInt();
		sc.close();
		if(numero<=tabla.length) {
		System.out.println(Arrays.toString(funcion.suma(tabla, numero)));
		}
		else {
			System.out.println("ERROR: La cantidad de números consecutivos no puede ser mayor a la cantidad de números total");
		}
	}
}
