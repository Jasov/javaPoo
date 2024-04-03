package edu.ucjc.programacion.poo;

public class Utilidades {

	static void validarEmail(String email) {
		boolean isValid = true;
		String mensaje = "";
		email= email.trim();
		//System.out.println(email);	
		if (email.contains(" ")) {
			isValid = false;
			mensaje += " tiene un espacio en blanco";
		}
		
		if (!email.contains("@") ||email.indexOf("@")!= email.lastIndexOf("@") ){
			isValid = false;
			mensaje += " debe tener una @";
		}else {
			int poscionArroba = email.indexOf("@");
			String dominio = email.substring(poscionArroba+1);
			if(!dominio.contains(".")) {
				isValid = false;
				mensaje += " debe contener un punto después de la @";
			}else {
				if (dominio.indexOf(".")<2) {
					isValid = false;
					mensaje += " La distancia entre la @ y el primer punto después de ésta tiene que ser superior a 2";
				}
				String subdominio = dominio.substring( dominio.lastIndexOf(".")+1 );
				if (subdominio.length()<2 || subdominio.length()>5) {
					isValid = false;
					mensaje += "El número de caracteres después del último punto debe estar entre 2 y 5";			
				}			
			}
		}
		if (!isValid) {
			System.out.println("El email "+ email + " no es valido " + mensaje);
		}
	}
	
	
}
