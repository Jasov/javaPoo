package edu.ucjc.programacion.repaso.ejercicios.bucles;

import java.util.Scanner;

public class MenuOpciones {
	public static void main(String[] args) {
		int opcion;
		do {
	    	System.out.println();

			System.out.println("======MENU======"); //menu con do() while (opcion!=4);
		    System.out.println("Opcion 1: MOSTRAR CUADRADO NUMEROS ");
		    System.out.println("Opcion 2: CUADRADO SIN BORDES ");
		    System.out.println("Opcion 3: fibo FIBONACCI ");
		    System.out.println("Opcion 4: SALIR");
		    System.out.println("=ELIGE UNA OPCION=");
	    	System.out.println();

		Scanner scan = new Scanner (System.in); // ctrl + shift + o para importar bibliotecas
	   // System.out.println("Introduce una opcion");
	    opcion = scan.nextInt();
	 //   System.out.println(opcion);
	   

	 //   if(opcion<=4&&opcion>0) {
	    	switch(opcion) {
	    	case 1: 
	    		//System.out.println("Has elegido opcion 1"); break;
	    		for(int i=1;i<10;i++){
		    		System.out.print(i);	
		    		if(i%3==0) {
		    			System.out.println();
		    		}
		    	}
	    	/*for(int i=1;i<=3;i++){
	    		System.out.print(
	    				i);	
	    	}
	    	System.out.println();
	    	for(int j=4 ;j<=6 ;j++ ) {
	    		System.out.print(j);
	    	}
	    	System.out.println();
	    	for(int k=7;k<=9;k++ ) {
	    		System.out.print(k);
	    	}	
	    	System.out.println();*/
	    	break;
	    	case 2:  
	    	      Scanner scanner = new Scanner(System.in);

	    	        System.out.print("Ingrese el perímetro del cuadrado: ");
	    	        System.out.println();
	    	        int perimetro = scanner.nextInt();

	    	        while (perimetro < 1) {
	    	            System.out.println("El perímetro debe ser al menos 1. Inténtelo de nuevo.");
	    	            System.out.print("Ingrese el perímetro del cuadrado: ");
	    	            perimetro = scanner.nextInt();
	    	        }

	    	        for (int i = 0; i < perimetro; i++) {
	    	            for (int j = 0; j < perimetro; j++) {
	    	                if (i == 0 || i == perimetro - 1 || j == 0 || j == perimetro - 1) {
	    	                    System.out.print("x ");
	    	                } else {
	    	                    System.out.print("  "); 
	    	                }
	    	            }
	    	            System.out.println(); 
	    	        }
	    		   break;
	    	case 3:
	    		//System.out.println("Has elegido opcion 3: Fibonacci"); 
	    		Scanner fibo = new Scanner (System.in); // ctrl + shift + o para importar bibliotecas
	    		System.out.println("Introduce un número:   ");
	    		   int rango = fibo.nextInt();
	    		//   System.out.println(rango); 
	    			 int numeroprevio = 0, siguienteNumero = 1;
	    		        System.out.print("Fibonacci Series de "+rango+" :");
	    		        for (int i = 1; i <= rango; i++)
	    		        {
	    		            System.out.print(numeroprevio+" ");
	    		            int sum = numeroprevio + siguienteNumero;
	    		            numeroprevio = siguienteNumero;
	    		            siguienteNumero = sum;
	    		        }
	    		    	System.out.println();

	    		  /* int num1 = 0, num2 = 1, suma = 1;   
	    	        System.out.println(num1);   
	    	        for (int i = 1; i < 20; i++) {
	    	            System.out.println(suma);	    	        
	    	            suma = num1 + num2;       
	    	            num1 = num2;  	           
	    	            num2 = suma;*/
	    		   break;
	    		   
	    		  
	    	}
	   /* }
	    else {
	    	System.out.println("Opcion no valida");
	    	System.out.println();

 	    }*/
	    }
		while(opcion!=4);
/*	    
do {
	System.out.println("Opcion valida");
	opcion--;
}
while(opcion>=4);*/
	}
	}

