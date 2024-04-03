package edu.ucjc.programacion.poo.composicion.coche;

public class Volante {
	    private long id;
	    private String tipo;
	    private String color;
	    
	    
		public Volante(long id, String tipo, String color) {
			super();
			this.id = id;
			this.tipo = tipo;
			this.color = color;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}

}
