package ej3;

public class Funcion {

		int[] rellenaPares(int longitud, int fin) {
			int tabla[] = new int [longitud];
			
			for(int i = 0; i<tabla.length; i++) {
				tabla[i] = (int) (Math.random()*((fin+1)-2)+2);
				if(tabla[i]%2 != 0) {
					tabla[i]++;
				}
			}
			
			return tabla;

	}

}
