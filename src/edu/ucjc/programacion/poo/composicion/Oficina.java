package edu.ucjc.programacion.poo.composicion;

public class Oficina {

	public static void main(String[] args) {
		Mesa mesa = new Mesa (1,"Blanco",300);
		Silla silla1 = new Silla(1,"blanca",75);
		Silla silla2 = new Silla(2,"blanca",75);
		Silla [] sillas = {silla1,silla2};
		Despacho despacho = new Despacho("DES-1",1);
		Despacho despacho2 = new Despacho ("DES-2",2,mesa,sillas);
		
		despacho.setMesa(mesa);
		despacho2.getMesa().setColor("azul");
	    System.out.println();
	    System.out.println();
	    System.out.println();
		
		
		
	}

}
