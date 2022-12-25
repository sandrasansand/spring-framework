package com.arquitecturajava.main;

/* * Además hemos usado encapsulación a nivel de paquetes visibilidad no acceso a
 * las class FacturaConIVA y FacturaSinIVA que no son public.
 * Sólo se puede entrar a través de la factoría. Sólo se ve la clase padre*/
import com.arquitecturajava.FactoriaFacturas;
import com.arquitecturajava.Factura;

public class Principal2 {

	public static void main(String[] args) {

		// que el que maneja las facturas en el programa
		// main no se da mucha cuenta de si existen clase hijas
		// o no existen todo queda encapsulado a traves del concepto de
		// factura

		Factura f1 = FactoriaFacturas.getInstance("IVA");

		f1.setNumero(1);
		f1.setConcepto("ordenador");
		f1.setImporte(1200);
		System.out.println("*****Con IVA*******");
		System.out.println(f1.getImporteTotal());

		Factura f2 = FactoriaFacturas.getInstance("SinIVA");
		f2.setNumero(1);
		f2.setConcepto("ordenador");
		f2.setImporte(1200);
		System.out.println("*****Sin IVA*******");
		System.out.println(f2.getImporteTotal());

	}

}
