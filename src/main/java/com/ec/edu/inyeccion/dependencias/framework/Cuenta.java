package com.ec.edu.inyeccion.dependencias.framework;

public class Cuenta {

	private String numero;
	private int saldo;
	
	public Cuenta() {
		// TODO Auto-generated constructor stub
	}
	
	public Cuenta(String numero, int saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}
	
	// SET - GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	} 
}
