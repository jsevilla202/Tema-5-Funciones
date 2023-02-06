package ej9;

public class Main {

	public static void main(String[] args) {
		int tabla[][] = new int [4][4];
		
		final Funcion funcion = new Funcion();
		
		System.out.println(funcion.esMagica(tabla)? "La tabla es magica" : "La tabla no es magica");

	}

}
