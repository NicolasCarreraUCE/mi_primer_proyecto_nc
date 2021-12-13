package com.ec.edu.deberes.clases.anónima;

public class CuentaCorriente implements ICuenta{

	private float montoMinimo;

	@Override
	public void calcularDescuento(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Calculando corrriente....");
	}

	@Override
	public void calcularBeneficio() {
		// TODO Auto-generated method stub
		System.out.println("Calculando beneficio correinte");
	}
	
	// SET -GET

	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

}
