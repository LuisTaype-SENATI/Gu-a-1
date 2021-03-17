package com.senati.eti;

import java.util.Scanner;

public class Clase8 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("Ingrese lado :");
		 int lado = sc.nextInt();
		 
		 int area = (int)Math.pow(lado,2);
		 
		 int perimetro = lado * 4;
		 
		 System.out.println("\n======= VALORES INGRESADOS =========");
		 System.out.println("Área........: "+ area);
		 System.out.println("Perímetro...: "+ perimetro);
		 
		
		
	}

}
