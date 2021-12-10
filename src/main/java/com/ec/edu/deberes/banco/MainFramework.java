package com.ec.edu.deberes.banco;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Ingrese su apellido: ");
		String apellido = sc.nextLine();
		System.out.print("Ingrese su numero de celular: ");
		String celular = sc.nextLine();
		
		CuentaHabiente ch = new CuentaHabiente();
		ch.setNombre(nombre);
		ch.setApellido(apellido);
		ch.setCelular(celular);
		
		System.out.println("Que tipo de cuenta desea crear: ");
		System.out.println("\t1. Cuenta de Ahorros");
		System.out.println("\t2. Cuenta Corriente");
		System.out.println("\t3. Cuenta de Póliza");
		int key = sc.nextInt();
		
		Cuenta cuenta = null;
		
		switch (key) {
		case 1:
			cuenta = new CuentaAhorros(0.05);
			break;
		case 2:
			cuenta = new CuentaCorriente(100.0);
			break;
		case 3:
			cuenta = new CuentaPoliza("10-12-2021");
			break;
		default:
			System.out.println("Error: cuenta no disponible");
			cuenta = new Cuenta();
		}
		
		GestorCuentas gestor = new GestorCuentas(cuenta);
		gestor.aperturaDeCuenta(ch);
	}

}
