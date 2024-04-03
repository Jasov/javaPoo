package edu.ucjc.programacion.repaso.arrays;

public class PruebaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena  = "texto";
		String cadena2 = new String ("texto");
		String cadena3 = "texto";
		System.out.println(cadena==cadena2);
		System.out.println(cadena==cadena3);
		System.out.println(cadena.equals(cadena2));/*equals para comparar valores dentro
		de strings, no == porque compara objetos. */
		
	System.out.println(cadena.contains("te"));
	System.out.println(cadena.indexOf("t"));
	System.out.println(cadena.lastIndexOf("t")); // posición que ocupa caracter
	System.out.println(cadena.charAt(2)); //caracter en la posición 
	
	String texto= "         Hola      ";
	System.out.println(texto.replace(" ","")); // remplaza izq por lo de la derecha .replace("a","A");
	System.out.println(texto.trim()); // Quita espacion en blanco izq, der no dentro del texto
	System.out.println(texto.trim().replace(" ", ",")); // borra espacios en blanco izq, der. 
	//Y remplaza espacios en blanco por , 
  
	String dato = " dajkdjad; ddajdda; sakddakjd; 2332";
	String[] datos= dato.split(";");
	//System.out.println(datos[5]);  Da una excepción, posición de array que no existe
	System.out.println(datos[3]);
	}

}
