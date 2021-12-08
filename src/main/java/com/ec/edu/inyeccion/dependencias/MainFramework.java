package com.ec.edu.inyeccion.dependencias;

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

		System.out.println("Infrese Faciltad");
		System.out.println("1. Medicina");
		System.out.println("2. Ingenieria");
		System.out.println("3. Arquitectura");
		int tipo = scanner.nextInt();
		
		Estudiante estudiante = new Estudiante();
		
		if (tipo == 1) {
			estudiante = new Estudiante();
		} else if (tipo == 2) {
			estudiante = new EstudianteOdontologuia();
		} else if (tipo == 3) {
			estudiante = new EstudianteArquitectura();
		}
				 
		Matricula matricula = new Matricula(estudiante, new Direccion());
		matricula.setAnio(2015);
		matricula.setSemestre("Sexto");
		
		System.out.println(matricula.matricular(nombre, apellido, calle, numeracion, tipo));

	}
}
