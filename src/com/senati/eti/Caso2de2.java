package com.senati.eti;

import java.util.Scanner;

public class Caso2de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese n�mero...:");
		int n = sc.nextInt();
		
		String mensaje = "N�mero es par";
		
		if(n % 2 != 0)
			mensaje = "Numero es impar";
		
		System.out.println("\nMensaje....: " + mensaje);
		

	}

}
