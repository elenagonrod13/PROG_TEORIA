package poo_alquilerCoches_Motor_Creado_En_Constructor;

import java.util.Scanner;
public class Principal {
	Vehiculo cinco;
	Vehiculo siete;
	public static Scanner tecla=new Scanner(System.in);
	public Principal() {	
		cinco=new Vehiculo ("3024JHT",5 ,"Diesel","120CV");
		siete=new Vehiculo ("2078HTL",7,"Gasolina","90CV");
		 int opcion=0;
		 Vehiculo espacio=null;
		 while (true) {			
			 opcion=insertar_menu();
			 switch(opcion) {			 
				 case 1:
					 if (Vehiculo.getCochesReservados()==2) 
					   System.out.println("No tenemos coches, lo sentimos");				 
				 	else {		
				 	      espacio=meter_plazas();		 		
					      espacio.alquilarCoche();
					 }
					 break;
				  case 2:					 
					 if (Vehiculo.getCochesReservados()==0)
						System.out.println("No hay coches para devolver, hay que reservar primero coche");
				 	 else {			
				 	       espacio=meter_plazas();				
					       espacio.devolverCoche();
				         }
				         break;  
                     		    }
		 }
	 }
	
	public int insertar_menu() {
		int opcion=0;
		System.out.println("1. Alquilar coche");
		System.out.println("2. Devolver coche");
		do {
			System.out.println("Meter opci?n (1-2)");
			opcion=tecla.nextInt();
		}while(opcion!=1 && opcion!=2);		
		return(opcion);
	}
	
	public Vehiculo meter_plazas() {
		int plazas=0;
		do {	 
			 System.out.println("?5 o 7 plazas?");
			 plazas=tecla.nextInt();
		}while(plazas!=5 && plazas!=7);		
		if(plazas==7)
			return siete;
		else
		return cinco;		
	}
	
	public static void main(String[] args) {
		
		Principal interfaz=new Principal();
	}

}
