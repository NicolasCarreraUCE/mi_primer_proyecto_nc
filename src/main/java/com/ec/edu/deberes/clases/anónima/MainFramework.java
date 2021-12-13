package com.ec.edu.deberes.clases.anónima;

import java.util.Scanner;

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
		} else if (tipo == 4) {
			cuenta = new ICuenta() {
				
				@Override
				public void calcularDescuento(String numero) {
					// TODO Auto-generated method stub
					System.out.println("Se calcula el descuento de cuenta anonima");
				}
				
				@Override
				public void calcularBeneficio() {
					// TODO Auto-generated method stub
					System.out.println("Se calcula el beneficio de la clase anonima");
				}
			};
		}
		GestorCuentas gestores = new GestorCuentas(cuenta);
		gestores.registrarCuentaHabiente();
	}

}
