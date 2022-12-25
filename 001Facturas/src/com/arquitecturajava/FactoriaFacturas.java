package com.arquitecturajava;
/*patr�n factory manera de encapsular el c�digo  -> principal2
 */
public class FactoriaFacturas {

	public static Factura getInstance(String tipo) {
		
		if (tipo.equals("IVA")) {
			
			return new FacturaConIVA();
		}else {
			
			return new FacturaSinIVA();
		}
	}
}
