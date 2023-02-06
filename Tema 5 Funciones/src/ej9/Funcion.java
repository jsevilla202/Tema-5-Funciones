package ej9;

public class Funcion {
	boolean esMagica(int tabla[][]) {
		boolean magica = true;
		int sumafila = 0;
		int sumacolum = 0;
		for(int i = 0; i<tabla.length; i++) {
			for(int j = 0; j<tabla.length;j++) {
				sumafila += tabla[i][j];
				sumacolum += tabla[j][i];
			}
			if(sumafila!=sumacolum) {
				magica = false;
				break;
			}
		}
		
		return magica;
	}

}
