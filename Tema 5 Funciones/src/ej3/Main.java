package ej3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int longitud;
		int fin;
		final Funcion funcion = new Funcion();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¿Cual es la longitud para la tabla deseada? ");
		longitud = sc.nextInt();
		
		System.out.println("Si el número introducido no es par, se utilizará el siguiente");
		System.out.print("¿Cuál desea que sea el número par más alto? ");
		fin = sc.nextInt();
		
		if(fin%2 != 0) {
			fin++;
		}
		sc.close();
		
		System.out.println(Arrays.toString(funcion.rellenaPares(longitud, fin)));

	}

}
