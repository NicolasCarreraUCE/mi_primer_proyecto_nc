package com.ec.edu.inyeccion.dependencias.extendida;

public class Estudiante {

	private String nombre;
	private String apellido;
	private Direccion direccion;
	
	
	
	public void pargarServipagos(String nombre){
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
	}
	
	// Metodos SET y GET
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
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
	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
}
