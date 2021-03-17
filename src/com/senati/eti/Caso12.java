package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		
		String frase = "ESCUELA DE TECNOLOGÍA E INFORMACIÓN";
		String p11 = frase.substring(0, 7); //ESCUELA
		String p12 = frase.substring(11, 21);//TECNOLOGIA
		String p13 = frase.substring(24, 35);//INFORMACION
		
		System.out.println("===============");
		System.out.println("Resultado");
		System.out.println("Palbra 1: " + p11);
		System.out.println("Palabra 2:"+  p12);
		System.out.println("Palabra 3: " + p13);

	}

}
