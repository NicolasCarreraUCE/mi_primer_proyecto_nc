package com.ec.edu.inyeccion.dependencias.modelos;

public class GestorCuentas {

	private ICuenta cuenta;
	
	public GestorCuentas(ICuenta cuenta) {
		// TODO Auto-generated constructor stub
		this.cuenta = cuenta;
	}
	
	public void registrarCuentaHabiente() {
		this.cuenta.calcularBeneficio();
		this.cuenta.calcularDescuento("343");
	}
}
