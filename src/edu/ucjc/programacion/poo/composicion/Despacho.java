package edu.ucjc.programacion.poo.composicion;

public class Despacho {
	
	private String ref;
	private int numPlanta;
	private Mesa mesa;
	private Silla []sillas;
	
	public Despacho(String ref, int numPlanta) {
		super();
		this.ref = ref;
		this.numPlanta = numPlanta;
		
	}
	
	public Despacho(String ref, int numPlanta, Mesa mesa, Silla[] sillas) {
		super();
		this.ref = ref;
		this.numPlanta = numPlanta;
		this.mesa = mesa;
		this.sillas = sillas;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public int getNumPlanta() {
		return numPlanta;
	}

	public void setNumPlanta(int numPlanta) {
		this.numPlanta = numPlanta;
	}

	public Mesa getMesa() {
		return mesa;
	}

	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}

	public Silla[] getSillas() {
		return sillas;
	}

	public void setSillas(Silla[] sillas) {
		this.sillas = sillas;
	}
	
	
}
