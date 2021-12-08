package com.ec.edu.inyeccion.dependencias;

public class EstudianteArquitectura extends Estudiante{

	private String municipio;

	public void pargarServipagos(String nombre){
		System.out.println(nombre + " hace el pago");
		System.out.println(nombre + " presenta el pago");
		System.out.println(nombre + " PayPal");
		
	}
	
	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
}
