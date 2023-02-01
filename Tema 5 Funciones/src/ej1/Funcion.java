package ej1;

public class Funcion {
	
	int  suma(int[] t) {
		int suma = 0;
		for(int i = 0; i< t.length; i++) {
			suma += t[i]; 
		}
		
		return suma;
	}
}
