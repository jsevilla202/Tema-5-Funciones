package ej5;

import java.util.Arrays;

public class Funcion {

	int[] sinRepetidos(int t[]) {
		int tabla[] = new int [t.length-1];
		
		tabla = Arrays.copyOf(t, t.length);
		Arrays.sort(tabla);
		for(int i = 1; i<tabla.length; i++) {
			if(tabla[i]==tabla[i-1]) {
				System.arraycopy(tabla, i+1, tabla, i, tabla.length - i - 1);
				tabla = Arrays.copyOf(tabla, tabla.length-1);
				i--;
			}
		}
		return tabla;
	}
}
