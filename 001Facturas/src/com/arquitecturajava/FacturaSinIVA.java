package com.arquitecturajava;

 class FacturaSinIVA extends Factura {

	
	public FacturaSinIVA() {
		super();
		
	}

	public FacturaSinIVA(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
		
	}

	@Override
	public double getImporteTotal() {
	
		return this.getImporte();
	}

}
