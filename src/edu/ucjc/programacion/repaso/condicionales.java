package edu.ucjc.programacion.repaso;

public class condicionales {

	public static void main(String[] args) {
		
		int numero = 9;
		boolean cumpleCondicion = ++numero > 9; /*++numero cambia variable y luego la 
		usa, numero++ usa la variable y luego la cambia.*/
		// numero+=2; suma dos, numero+=10 suma diez.
		if (cumpleCondicion) { //no poner cumpleCondicion==9, reiteración.
			System.out.println("Numero mayor 9");
		}
		else if (numero>6 && numero <7){ // && evalua la primera, si es falsa 
			//no comprueba la siguiente, & comprueba el 1ro y 2do (no optimo).
			//Lo mismo con las barras ||, |
			System.out.println("Numero mayor que 6 <7 ");	
}
		else if (numero>4 || numero==2){
			System.out.println("Numero mayor que 4 o 2");	
}
		else{
			System.out.println("otro resultado");
			//ctrl+f, remplazar o buscar.
		
		}
		//switch evalua una única variable, if puede evaluar 2. evalua enteros y strings
		//switch, case, default, break.
		int opcion=3;
		switch (opcion) {
		case 3: System.out.println("El valor es 3"); break;
		case 9: System.out.println("El valor es 9"); break;
		default: System.out.println("otro resultado"); 
		} 
		}
}
