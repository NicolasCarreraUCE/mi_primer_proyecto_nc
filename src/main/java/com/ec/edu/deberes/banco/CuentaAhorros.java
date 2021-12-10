package com.ec.edu.deberes.banco;

public class CuentaAhorros extends Cuenta {

	private double porcentajeDescuento;

	public CuentaAhorros(double porcentajeDescuento) {
		// TODO Auto-generated constructor stub
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	@Override
	public void crearCuenta(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		super.crearCuenta(cuentaHabiente);
		super.interes = super.saldo * 10.0 / 100.0;
		System.out.println(this.toString());
	}
	
	// GET-SET
	public double getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(double porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}

	@Override
	public String toString() {
		return super.toString() + " CuentaAhorros [porcentajeDescuento=" + porcentajeDescuento + "]";
	}
	
	
	
}
