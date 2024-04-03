package edu.ucjc.programacion.poo;

public class Persona {

	private String nombre;
	private String apellido;
	private String dni;
	private int edad;


public Persona () {
}
public Persona (String nombre,String apellido, String dni, int edad) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.dni=dni;
	 this.edad=edad;
}
public String getNombre() {
	return this.nombre;
}
public String getDni() {
	return this.dni;
}
public String getApellido() {
	return this.apellido;
}
public int getEdad() {
	return this.edad;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public void setDni(String dni) {
	this.dni = dni;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public void correr () {
if (this.edad<18) {
	System.out.println("Corre muy rapido");
}
else if (edad>=18 && edad<40) {
	System.out.println("Corre rapido");
}
else {
	System.out.println("Corre lento");
}
}

/*public void setNombre(String nombre,String apellido, String dni, int edad) {
	this.nombre=nombre;
	this.apellido=apellido;
	this.dni=dni;
	 this.edad=edad;
}*/

}
