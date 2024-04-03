package edu.ucjc.programacion.poo.composicion.coche;

public class Piston {
	private long id;
    private String marca;
    
    
	public Piston(long id, String marca) {
		super();
		this.id = id;
		this.marca = marca;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
    
    
}
