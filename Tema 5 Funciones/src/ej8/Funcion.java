package ej8;

import java.util.Arrays;

public class Funcion {
	int[] suma(int t[], int numElementos) {
		int tabla[] = new int [0];
		int suma;
		int contador = 0;
		for(int i = 0; i<t.length-1; i++) {
			if(contador == t.length-1) {
				break;
			}
			else {
			suma = 0;
			tabla = Arrays.copyOf(tabla, tabla.length+1);
			for(int j = 0; j<numElementos; j++) {
				suma += t[j+i];
				contador = j+i;
			}
			tabla[i] = suma;
			}
		}
		return tabla;
	}
}
