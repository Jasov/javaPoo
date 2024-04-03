package edu.ucjc.programacion.poo.composicion;

public class Mesa {
	private long id;
	private String color;
	private double precio;
	
	public Mesa(long id, String color, double precio) {
		super();
		this.id = id;
		this.color = color;
		this.precio = precio;
	}
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
}
