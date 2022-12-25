package com.arquitectura.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Principal5SpringColecciones {

	public static void main(String[] args) {
//empleo de una rel 1:n entre per -> facturas y lineaFactura(tabla intermedia) mediante una coleccion en el contexto
		ApplicationContext contexto = new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");

		Persona persona = contexto.getBean(Persona.class);
		System.out.println("*******persona********");
		System.out.println(persona.getNombre());
		System.out.println(persona.getFactura().getConcepto());
		
		System.out.println("********facturas/linasFacturas*********");
		
		
		for (LineaFactura linea : persona.getFactura().getLineas()) {

			System.out.println("Número: " +linea.getNumero());
			System.out.println("Concepto: " +linea.getConcepto());
			System.out.println("Importe: " + linea.getImporte());

		}
		
	

	}

}
