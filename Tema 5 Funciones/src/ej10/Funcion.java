package ej10;

import java.util.Arrays;

public class Funcion {
	int[][] gira90(int tablaInicio[][]) {
		int tabla[][] = new int [tablaInicio.length][tablaInicio[0].length];
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla.length; j++) {
				tabla[j][tabla.length-1-i] =tablaInicio[tabla.length-1-i][j];
			}
		}
		
		for(int i = 0; i<tabla.length; i++) {
			System.out.println(Arrays.toString(tabla[i]));
		}
		
		return tabla;
		
	}
}
