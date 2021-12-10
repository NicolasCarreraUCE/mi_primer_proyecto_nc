package com.ec.edu.deberes.banco;

public class CuentaHabiente {

	private String nombre;
	private String apellido;
	private String celular;
	
	// SET-GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "CuentaHabiente [nombre=" + nombre + ", apellido=" + apellido + ", celular=" + celular + "]";
	}
}
