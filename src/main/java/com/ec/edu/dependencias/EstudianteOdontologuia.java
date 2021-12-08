package com.ec.edu.dependencias;

public class EstudianteOdontologuia extends Estudiante {
	
	private String ciudadRural;
	
	public void pargarServipagos(String nombre){
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + " Efectivo");
		
	}

	// Metodos SET y GET
	public String getCiudadRural() {
		return ciudadRural;
	}

	public void setCiudadRural(String ciudadRural) {
		this.ciudadRural = ciudadRural;
	}
	
	

}
