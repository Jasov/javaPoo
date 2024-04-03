package edu.ucjc.programacion.poo.composicion.coche;

public class Circuito {

	public static void main(String[] args) {
	
		Piston piston1 = new Piston (12,"bmw");
		Volante volante1= new Volante (1,"manual","Negro");
		Motor motor1= new Motor ("bmw",240,piston1);
		Piston piston2 = new Piston (22,"Skoda");
		Volante volante2= new Volante (2,"manual","Azul");
		Motor motor2= new Motor ("Skoda",200,piston2);
		
		
		
		 Coche coche1= new Coche ("A1203","BMW",volante1,motor1,240.0);
		 Coche coche2= new Coche ("B2204","Skoda",volante2,motor2,200.0);		 
		 Coche[] coches= {coche1, coche2};
		 
		 for (int i=0;i<2;i++) {
			 coches[i].conducir();
			 System.out.println(coches[i].getVolante().getId());
		 }
		 
		
	}

}
