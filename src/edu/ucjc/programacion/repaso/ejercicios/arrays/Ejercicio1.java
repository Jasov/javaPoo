package edu.ucjc.programacion.repaso.ejercicios.arrays;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		// Array enteros, tamaño que pida por consola, solicitar números.
		
		int rango;
		System.out.println("Introduzca el rango del vector: ");
		Scanner scan = new Scanner (System.in); 	
	    rango = scan.nextInt();
		int [] numeros = new int [rango];	
		int [] [] numeroBidimensional = new int [2][3];	// Vector bidimensional o Matriz
		for (int i=0; i<rango; i++) {
			int num;
			System.out.println("Introduzca el numero para la posicion"+"  "+(i+1));
			Scanner scann = new Scanner (System.in); 
			numeros[i] = scann.nextInt();;
		}
		for (int i=0; i<rango; i++) {
			if(numeros[i]%2==0) {
			System.out.println("Numeros par dentro del array:  " +numeros[i]);
		}}
	}
}