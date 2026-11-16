package org.ejercicios.trucos.java;

public class PruebasStream {
	
	public static void main(String[] args) {
		System.out.println("Se modifico esta prueba");
		Integer resultado = validaIteracion();
		System.out.println("Este es el resultado: " + resultado);
	}
	
	public static Integer validaIteracion() {
		Integer resultado = 0;
		for (int i = 0; i < 5; i++) {
			resultado += 2;
		}
		return resultado;
	}

}
