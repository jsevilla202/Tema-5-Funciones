package ej7;

import java.util.Arrays;

public class Funcion {
	int[] buscarTodos(int t[], int valor) {
		int tabla[] = new int [0];
		int j = 0;
		for(int i = 0; i<t.length; i++) {
			if(t[i]==valor) {
				tabla = Arrays.copyOf(tabla, tabla.length+1);
				tabla[j] = i;
				j++;
			}
		}
		return tabla;
	}
}
