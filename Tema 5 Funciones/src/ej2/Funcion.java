package ej2;

public class Funcion {
	int maximo(int t[]) {
		int max = 0;
		
		for(int valor : t) {
			if(valor>max) {
				max = valor;
			}
		}
		
		return max;
	}
}
