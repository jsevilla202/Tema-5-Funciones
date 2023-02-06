package ej10;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int tabla[][] = new int [4][4];
		final Funcion funcion = new Funcion();
		
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla.length; j++) {
				tabla[i][j] = (int) (Math.random()*101);
			}
			System.out.println(Arrays.toString(tabla[i]));
		}
		System.out.println();
		funcion.gira90(tabla);
		
		

	}

}
