package edu.ucjc.programacion.poo;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona persona1= new Persona ();
		persona1.setNombre("xdd");
		persona1.setApellido("H");
		persona1.setDni("212nn");
		persona1.setEdad(21);
		System.out.println(persona1.getNombre());
		System.out.println(persona1.getApellido());
		System.out.println(persona1.getDni());
		System.out.println(persona1.getEdad());
		persona1.correr();
		
	}

}
