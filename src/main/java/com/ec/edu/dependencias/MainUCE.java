package com.ec.edu.dependencias;

import java.util.Scanner;

public class MainUCE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
 		
		System.out.println("Ingrese Nombre:");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese Apellido:");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Calle:");
		String calle = scanner.nextLine();
		
		System.out.println("Ingrese Numeracion:");
		String numeracion = scanner.nextLine();

		Matricula matricula = new Matricula();
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		matricula.matricular(nombre, apellido, calle, numeracion);
	}

}
