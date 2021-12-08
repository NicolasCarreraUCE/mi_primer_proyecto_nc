package com.ec.edu.inyeccion.dependencias;

public class Estudiante {

	protected String nombre;
	protected String apellido;
	protected Direccion direccion;
	
	private String facultad;
	
	
	
	public void pargarServipagos(String nombre){
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + " Tarjeta");
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
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
}
