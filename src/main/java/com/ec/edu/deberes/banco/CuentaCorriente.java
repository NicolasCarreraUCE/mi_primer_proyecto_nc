package com.ec.edu.deberes.banco;

public class CuentaCorriente extends Cuenta {

	private double montoMinimo;
	
	public CuentaCorriente(double montoMinimo) {
		// TODO Auto-generated constructor stub
		this.montoMinimo = montoMinimo;
	}
	
	@Override
	public void crearCuenta(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		super.crearCuenta(cuentaHabiente);
		super.interes = saldo * 8.0 / 100.0;
		System.out.println(this.toString());
	}
	
    // GET-SET
	public double getMontoMinimo() {
		return montoMinimo;
	}
	public void setMontoMinimo(double montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	@Override
	public String toString() {
		return super.toString() + " CuentaCorriente [montoMinimo=" + montoMinimo + "]";
	}
	
	
}
