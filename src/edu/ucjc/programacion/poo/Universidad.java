package edu.ucjc.programacion.poo;

public class Universidad {
	
	//ojo abajo
	//Cuando se pidan los datos, meter dos asignaturas, definir array a 2 y cuando lo pida poner 2 asignaturas.
	
	public static void main(String[] args) {
		
	//	  Universidad uni= new Universidad();//Para usar el metodo validar email sin ser
		  //static tengo que crear un objeto universidad y luego usarlo para llamar al metodo
		  //de Universisad y usarlo. Un metodo static, puede llamar a un metodo static

		Alumno [] alumnos =new Alumno [4];
		alumnos[0] = new Alumno("Jose","A",20,"Robótica","Primero","email@xdnt.com");
		String [] asignaturasAlumno1 = {"Calculo","Algebra","Programacion"};
		alumnos[0].setAsignaturas(asignaturasAlumno1);
	//	alumno1.mostrarInfoAlumno();
		
		String [] asignaturasAlumno2 = new String[3];
		asignaturasAlumno2[0]="Asignatura1";
		asignaturasAlumno2[1]="Asignatura2";
		alumnos[1] =new Alumno("Alumno2","Apellido2",21,"Robótica","Segundo","hola",asignaturasAlumno2);
		//alumno2.mostrarInfoAlumno();
		
		 alumnos[2]= new Alumno("Alumno3","Apellido3",19,"Robótica","Primero","hola");
		//alumno3.mostrarInfoAlumno();
		
		 alumnos[3] = new Alumno("Alumno4","Apellido4",18,"Robótica","Primero","xd", 
				new String[] {"Asignatura4","Asignatura5","Asignatura6"});
		//alumno4.mostrarInfoAlumno();
		for (Alumno alumn: alumnos) {
			alumn.mostrarInfoAlumno();
			Utilidades.validarEmail(alumn.getEmail()); //UTILIDADES ES ESTATICO, 
			//NO NECESITO CREAR OBJETO, PQ YA EXISTE EN MEMORIA.
			System.out.println();
			System.out.println();}}



}