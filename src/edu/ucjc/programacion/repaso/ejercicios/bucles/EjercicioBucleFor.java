package edu.ucjc.programacion.repaso.ejercicios.bucles;

public class EjercicioBucleFor {

	public static void main(String[] args) {
		 
		 for (int i=2 ,j=99;i<=100 && j>=2;i+=2, j-=2) { //condicion j es redundante pq coincide el rango
			System.out.println("Numero Par :"+i+" - "+ "Numero Impar: "+ j);  
		 }
	/*	 for (int j=100;j>=0 ;j--) {
			 if (j%2==1) {
				System.out.println(j);	
				}
		 }
*/	
	 
	 
	}

}
