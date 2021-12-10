package com.ec.edu.deberes.banco;

public class GestorCuentas {

	private Cuenta tipoDeCuenta;
	
	public GestorCuentas(Cuenta tipoDeCuenta) {
		// TODO Auto-generated constructor stub
		this.tipoDeCuenta = tipoDeCuenta;
	}
	
	public void aperturaDeCuenta(CuentaHabiente cuentaHabiente) {
		tipoDeCuenta.crearCuenta(cuentaHabiente);
		System.out.println("Se ha credo la cuenta exitosamente");
	}

}
