package com.ec.edu.dependencias;

public class Matricula {

	private String semestre;
	private int anio;
	private Estudiante estudiante;
	private Direccion direccion;
	
	public String matricular(String nombre, String apellido, String calle, String numero, int tipo) {
		
		if (tipo == 1) {
			this.estudiante = new Estudiante();
		} else if (tipo == 2) {
			this.estudiante = new EstudianteOdontologuia();
		} else if (tipo == 3) {
			this.estudiante = new EstudianteArquitectura();
		}
		
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		//this.estudiante.setFacultad(facultad);		
		
		this.direccion.setCallePrincipal(calle);
		this.direccion.setNumeracion(numero);
		
		// logica para guardar en la base de datos los datos de la matricula y el estudiante
		
		System.out.println(this.estudiante);
		
		this.estudiante.pargarServipagos(nombre);
		
		return "Estudiante Guardado con Exito";
	}
	
	// Metodos SET y GET
	public String getSemestre() {
		return semestre;
	}
	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Estudiante getEstudiante() {
		return estudiante;
	}
	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
}
