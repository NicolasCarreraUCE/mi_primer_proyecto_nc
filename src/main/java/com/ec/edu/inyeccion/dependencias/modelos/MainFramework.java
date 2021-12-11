package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

import com.ec.edu.inyeccion.dependencias.extendida.Direccion;
import com.ec.edu.inyeccion.dependencias.extendida.Estudiante;
import com.ec.edu.inyeccion.dependencias.extendida.Matricula;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese Tipo:");
		int tipo = scanner.nextInt();
		ICuenta cuenta = null;
		if (tipo == 1) {
			cuenta = new CuentaCorriente();
		} else if (tipo == 2) {
			cuenta = new CuentaAhorros();
		} else if (tipo == 3) {
			cuenta = new CuentaFuturo();
		}
		GestorCuentas gestores = new GestorCuentas(cuenta);
		gestores.registrarCuentaHabiente();
	}

}
