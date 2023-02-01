package ej5;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int tabla[] = {3,3,4,4,4,5, 5};
		final Funcion funcion = new Funcion();
		
		
		System.out.println(Arrays.toString(funcion.sinRepetidos(tabla)));

	}

}
