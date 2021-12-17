package nicolas.carrera.tarea;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");

		// Estudiante
		Paciente pct = (Paciente)app.getBean("paciete");
		System.out.println("Nombre estudiante: " + pct.getNombre() + " Apellido: " + pct.getApellido() + " Edad: " + pct.getEdad());
		
		// Profesora
		Profesor prf = (Profesor)app.getBean("profesor");
		System.out.println("Nombre profesor: " + prf.getNombre() + " Apellido: " + prf.getApellido() + " Profesion: " + prf.getProfesion() + " Universidad: " + prf.getUnivarsidad());

	}

}
