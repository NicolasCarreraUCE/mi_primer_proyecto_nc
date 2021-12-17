package nicolas.carrera.tarea;

public class Profesor {
	private String nombre;
	private String apellido;
	private String profesion;
	private String univarsidad;
	
	public Profesor() {
		// TODO Auto-generated constructor stub
	}
	
	public Profesor(String nombre, String apellido, String profesion, String univarsidad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.profesion = profesion;
		this.univarsidad = univarsidad;
	}
	
	// SET - GET
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
	public String getProfesion() {
		return profesion;
	}
	public void setProfesion(String profesion) {
		this.profesion = profesion;
	}
	public String getUnivarsidad() {
		return univarsidad;
	}
	public void setUnivarsidad(String univarsidad) {
		this.univarsidad = univarsidad;
	}
}
