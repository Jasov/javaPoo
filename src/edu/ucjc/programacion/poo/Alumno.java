package edu.ucjc.programacion.poo;

public class Alumno {

private String nombre;
private String apellidos;
private int edad;
private String cursando;
private String curso;
private String email;
private String asignaturas[];

public Alumno(String nombre, String apellidos, int edad, String cursando, String curso) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.cursando = cursando;
	this.curso = curso;	
}
public Alumno(String nombre, String apellidos, int edad, String cursando, String curso, String email) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.edad = edad;
	this.cursando = cursando;
	this.curso = curso;
	this.email= email;
}

public Alumno(String nombre, String apellidos, int edad, String cursando, String curso,String email, String[] asignaturas) {
    super();
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.edad = edad;
    this.cursando = cursando;
    this.curso = curso;
    this.asignaturas = asignaturas;
	this.email= email;

}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public String getCursando() {
	return cursando;
}
public void setCursando(String cursando) {
	this.cursando = cursando;
}
public String getCurso() {
	return curso;
}
public void setCurso(String curso) {
	this.curso = curso;
}
public String[] getAsignaturas() {
	return asignaturas;
}
public void setAsignaturas(String[] asignaturas) {
	this.asignaturas = asignaturas;
}

public void mostrarInfoAlumno() {

	System.out.println("El alumno "+ this.nombre + " " + this.apellidos +
			" está estudiando "+this.curso + " de " + this.cursando + " con email " + this.email);
	
	if (asignaturas!=null){
		System.out.println("Con las asignaturas: ");
		for (String asignatura : asignaturas) {
			if(asignatura!=null) {
				System.out.println( "\t"+asignatura.toUpperCase());
			}
		}
	}else {
		System.out.println("El alumno no está matriculado de ninguna asignatura");
	}
}



}

	
		