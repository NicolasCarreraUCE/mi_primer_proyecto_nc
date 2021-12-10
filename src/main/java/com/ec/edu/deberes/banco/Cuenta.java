package com.ec.edu.deberes.banco;

public class Cuenta {

	protected String numeroCuenta;
	protected double saldo;
	protected double interes;
	
	protected CuentaHabiente cuentaHabiente;
	
	public void crearCuenta(CuentaHabiente cuentaHabiente) {
		this.cuentaHabiente = cuentaHabiente;
		int numeroCuentaGenerado = (int) (Math.random()* 999999999);
		this.numeroCuenta = String.valueOf(numeroCuentaGenerado);
		this.saldo = 100.0;
	}

	@Override
	public String toString() {
		return "Cuenta [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", interes=" + interes
				+ ", cuentaHabiente=" + cuentaHabiente + "]";
	}
	
	
}
