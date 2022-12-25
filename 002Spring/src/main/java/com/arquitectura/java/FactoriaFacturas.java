package com.arquitectura.java;

public class FactoriaFacturas {

	public static Factura getInstance(String tipo) {
		
		if (tipo.equals("IVA")) {
			
			return new FacturaConIVA();
		}else {
			
			return new FacturaSinIVA();
		}
	}
}
