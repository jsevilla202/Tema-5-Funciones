package ej4;

public class Funcion {
	int buscar(int t[], int clave) {
		int posicion = 0;
		
		for(int i = 0; i<t.length; i++) {
			if(t[i]==clave) {
				posicion = i;
				break;
			}
		}
		return posicion;
	}

}
