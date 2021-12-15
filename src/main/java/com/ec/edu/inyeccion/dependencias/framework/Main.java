package com.ec.edu.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		Cuenta miCuenta = (Cuenta) app.getBean("cuenta");
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());
		
		// Estros contenedores NO SON CONTENEDORES DE MICRO SERVICIOS, son de inyeccion dependencias
		Cuenta miCuenta1 = (Cuenta) app.getBean("cuenta1");
		System.out.println(miCuenta1.getNumero());
		System.out.println(miCuenta1.getSaldo());
		
		//IoC por contructor
		Estudiante estu = (Estudiante)app.getBean("estu");
		System.out.println(estu.getNombre() + " " + estu.getApellido() + " " + (estu.getEdad() + 10));
	}
	
}