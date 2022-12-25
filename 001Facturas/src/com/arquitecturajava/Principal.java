package com.arquitecturajava;

public class Principal {

	public static void main(String[] args) {
		
		FacturaConIVA f1= new FacturaConIVA(1,"ordenador",1200);
		System.out.println(f1.getImporteTotal());
		
		FacturaSinIVA f2= new FacturaSinIVA(1,"ordenador",1200);
		System.out.println(f2.getImporteTotal());
		

		imprimir(f1);
		imprimir(f2);
		
	}
	
	//uso de las capacidades de polimorfismo y hemos encapsulado los conceptos
	// de facturaConIVA y de facturaSinIVA. 
	
	public static void imprimir (Factura factura) {
		
		// no sabe que tipologias de facturas existen
		// esto es usar encapsulacion a nivel de herencia, aporta simplicidad al código
		
		System.out.println("*************");
		System.out.println(factura.getImporteTotal());
		System.out.println("*************");
		
	}
	
	

}
