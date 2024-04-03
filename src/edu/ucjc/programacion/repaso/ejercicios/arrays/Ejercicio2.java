package edu.ucjc.programacion.repaso.ejercicios.arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
 
	/*	String email = "asdas@gmail.com;  x@com;123";
		String[] emails= email.split(";");*/
		String []emails= { "asdas@gmail  .com  ","x@com","123"};
	
/*	for (int i=0; i<3;i++) {
	System.out.println(emails[i]);}*/
		boolean isValid=true;
		String mensaje= "";
		for (String email: emails) {
			System.out.println(email);
			email=email.trim(); //Quita espacios en blanco izquierda o derecha
			
			if (email.contains(" ")) {
				isValid=false;
				mensaje += " Tiene un espacio en blanco ";
//System.out.println("El email  "+ email + " no es valido tiene un espacio en blacno");}
			}
			if (!email.contains("@") || email.indexOf("@")!= email.lastIndexOf("@")) {
				isValid=false;
				mensaje += " debe tener una @ ";
			}
			else {
				int posicionArroba= email.indexOf("@");
				String dominio=email.substring(posicionArroba+1);
				if(!dominio.contains(".")) {
					isValid = false;
					mensaje += " debe contener un punto despues de la @ ";
				}else {
					if(dominio.indexOf(".")<2) {
						isValid = false;
						mensaje += " la distancia entre la @ y el primer punto despues de esta es incorrecta ";
					}
					String subdominio = dominio.substring(dominio.lastIndexOf(".")+1);
					if (subdominio.length()<2|| subdominio.length()>5) {
						isValid = false;
						mensaje += " El numero de caracteres despues del punto debe estar entre 2 y 5 ";
					}
				}
			}
			
			if(!isValid) {
				System.out.println("El email  "+ email + " no es valido "+ mensaje);
				}}}} 
