package com.ec.edu.deberes.clases.anónima;

public class CuentaAhorros implements ICuenta {

	private String numeroAhorro;
	private int monto;
	
	@Override
	public void calcularDescuento(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se calcula el descuento de: " + numero);
		
	}
	@Override
	public void calcularBeneficio() {
		// TODO Auto-generated method stub
		System.out.println("Se calcula el beneficio....");
	}
	
	// SET - GET
	public String getNumeroAhorro() {
		return numeroAhorro;
	}
	public void setNumeroAhorro(String numeroAhorro) {
		this.numeroAhorro = numeroAhorro;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
		
}
