package com.arquitectura.java;


public class Principal3SinSpring {

	public static void main(String[] args) {
	
		
		Factura f= FactoriaFacturas.getInstance("SinIVA");
		
		f.setNumero(1);
		f.setImporte(200);
		f.setConcepto("tablet");
		
		System.out.println(f.getImporteTotal());
		
	
		
		
		

	}

}
