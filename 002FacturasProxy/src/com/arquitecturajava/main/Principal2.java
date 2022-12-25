package com.arquitecturajava.main;

import com.arquitecturajava.FactoriaFacturas;
import com.arquitecturajava.Factura;

public class Principal2 {

	public static void main(String[] args) {
		
	
		
		Factura f1= FactoriaFacturas.getInstance("IVA");
	
		f1.setNumero(1);
		f1.setConcepto("ordenador");
		f1.setImporte(200);
		System.out.println(f1.getImporteTotal());
		
		Factura f2= FactoriaFacturas.getInstance("SinIVA");
		f2.setNumero(1);
		f2.setConcepto("ordenador");
		f2.setImporte(200);
		System.out.println(f2.getImporteTotal());
		

	
	}
	
	
	

}
