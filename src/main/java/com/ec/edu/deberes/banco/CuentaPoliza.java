package com.ec.edu.deberes.banco;

public class CuentaPoliza extends Cuenta {

	private String fechaVigente;

	public CuentaPoliza(String fechaVigente) {
		// TODO Auto-generated constructor stub
		this.fechaVigente = fechaVigente;
	}
	
	@Override
	public void crearCuenta(CuentaHabiente cuentaHabiente) {
		// TODO Auto-generated method stub
		super.crearCuenta(cuentaHabiente);
		super.interes = super.saldo * 15.0 / 100.0;
		System.out.println(this.toString());
	}
	
	// GET-SET
	public String getFechaVigente() {
		return fechaVigente;
	}
	public void setFechaVigente(String fechaVigente) {
		this.fechaVigente = fechaVigente;
	}

	@Override
	public String toString() {
		return super.toString() + " CuentaPoliza [fechaVigente=" + fechaVigente + "]";
	}
	
	
}
