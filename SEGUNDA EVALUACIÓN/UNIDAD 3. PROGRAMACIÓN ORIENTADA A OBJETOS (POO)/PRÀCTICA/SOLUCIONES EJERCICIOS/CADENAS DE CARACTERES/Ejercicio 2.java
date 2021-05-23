package cadenas;
import java.util.*;
public class Ejercicio2 {
	private final int LIMITE=4;
	private Scanner teclado=new Scanner(System.in);

	 public Ejercicio2() {
		meterPalabras();
	}
		
	public void meterPalabras() {
	 String cadena="";
	 for (int cont=1; cont<=LIMITE; cont++){	
	   System.out.println("Meter una palabra");
	   cadena=teclado.nextLine();
	   System.out.println("La primera letra es: "+ obtenerPrimera(cadena));
	   System.out.println("La última letra es: "+ obtenerUltima(cadena));
	   construirTriangulo(cadena);
	 }
	 teclado.close();	
	}
	//Obtiene la primera letra de una cadena
		
	public char obtenerPrimera(String cadena){
	  return (cadena.charAt(0));
	}
			
	//Obtiene la última letra de una cadena
			
	public char obtenerUltima(String cadena){
	  int lon=cadena.length();
	  return (cadena.charAt(lon-1));
	}
				
	//Construye un triángulo con las palabras
			
	public void construirTriangulo(String cadena){
	  System.out.println("\nTriangulo\n");
	  for(int i=1;i<=cadena.length();i++)	
		System.out.println(cadena.substring(0,i));			
	}
	public static void main(String[] args){
	  Ejercicio2 interfaz=new Ejercicio2();
	}

}
