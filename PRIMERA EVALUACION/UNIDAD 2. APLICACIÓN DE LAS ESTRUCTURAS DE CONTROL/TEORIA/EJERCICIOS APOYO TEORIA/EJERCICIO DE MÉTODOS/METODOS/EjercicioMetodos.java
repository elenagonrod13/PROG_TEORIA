package afianzarTeoria;
import java.util.*;
public class Ejercicio2 {
	static Scanner teclado=new Scanner(System.in);
	public static void main(String[] args) {		
	    int numero= leerNumero();	
	    while(numero!=0){
		 System.out.println("El número es: "+ numero);
		 comprobarNumero(numero);
		 numero= leerNumero();
	    }   	    
    }

	public static int leerNumero(){
		
		System.out.print ("Ingresar número:  ");
		return (teclado.nextInt());	
	}
	

	public static void comprobarNumero(int num){
		 if (num>8)
			 visualizarDoble(num);
			
			 else
				visualizarTriple(num);
	}


	public static void visualizarDoble(int numero){
	    System.out.println("El doble de "+numero+" es "+numero*2);	
	}
	

	public static void visualizarTriple(int numero){
	   System.out.println("El triple de "+numero+" es "+numero*3);	
	}
	
}
