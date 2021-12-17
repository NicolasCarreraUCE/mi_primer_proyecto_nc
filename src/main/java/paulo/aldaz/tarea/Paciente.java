package paulo.aldaz.tarea;

public class Paciente {
	private String loquesea;
	private String nombre, apellido;
	private int edad;
	
	
	public Paciente() {
		
	}
	
	public Paciente(String nombre, String loquesea) {
		super();
		this.nombre = nombre;
		this.loquesea = loquesea;
	}
	//set y get
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getLoquesea() {
		return loquesea;
	}

	public void setLoquesea(String loquesea) {
		this.loquesea = loquesea;
	}
	
	

}
