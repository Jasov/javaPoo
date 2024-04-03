package edu.ucjc.programacion.poo.composicion.coche;

public class Motor {

	private String marca;
	private int numCaballos;
	private Piston piston;
	
	
	
	public Motor(String marca, int numCaballos, Piston piston) {
		super();
		this.marca = marca;
		this.numCaballos = numCaballos;
		this.piston = piston;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getNumCaballos() {
		return numCaballos;
	}
	public void setNumCaballos(int numCaballos) {
		this.numCaballos = numCaballos;
	}
	public Piston getPiston() {
		return piston;
	}
	public void setPiston(Piston piston) {
		this.piston = piston;
	}

}
