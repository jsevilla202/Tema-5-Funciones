package ej6;

import java.util.Arrays;

public class Funcion {

	int[] eliminarMayores(int t[], int valor) {
		int tabla[] = new int [t.length-1];
		tabla = Arrays.copyOf(t, t.length);
		for(int i = 1; i<tabla.length; i++) {
			if(tabla[i]>valor) {
				System.arraycopy(tabla, i+1, tabla, i, tabla.length - i - 1);
				tabla = Arrays.copyOf(tabla, tabla.length-1);
				i--;
			}
		}
		return tabla;
	}
}
