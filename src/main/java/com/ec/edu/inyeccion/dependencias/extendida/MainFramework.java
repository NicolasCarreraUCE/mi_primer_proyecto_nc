package com.ec.edu.inyeccion.dependencias.extendida;

import java.util.Scanner;

public class MainFramework {

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

		Matricula matricula = new Matricula(new Estudiante(), new Direccion());
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		System.out.println(matricula.matricular(nombre, apellido, calle, numeracion));

	}
}
