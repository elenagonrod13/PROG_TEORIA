package cadenas;
import java.util.*;
public class Ejercicio1 {
private Scanner teclado=new Scanner (System.in);
	
	public Ejercicio1() {
	  char caracter;
	  String cadena=null;
	  int longitud=0, numeroCaracteres=0;
	  System.out.println("Meter cadena");
	  cadena=teclado.nextLine();
	  while (!cadena.equalsIgnoreCase("fin")){
		longitud=calcularLongitud(cadena);
		System.out.println("La longitud de la cadena es: "+longitud);
		convertirMayusculas(cadena);
		convertirMinusculas(cadena);
		sacarSubcadena(cadena);
		System.out.println("Meter el carácter a buscar en la cadena");
		caracter=teclado.next().charAt(0);
		numeroCaracteres=contarCaracteres(caracter,cadena);
		System.out.println("El carácter "+caracter+" se repite "
		+numeroCaracteres+" veces");
		teclado.nextLine(); //Vaciamos el buffer de memoria
		System.out.println("Meter cadena");
		cadena=teclado.nextLine();
	  }
	teclado.close();
    }
	
	public int calcularLongitud(String cad){

		return(cad.length());
	}
	
	public void convertirMayusculas (String cad){

		System.out.println(cad.toUpperCase());
	}
	
	public void convertirMinusculas (String cad){

		System.out.println(cad.toLowerCase());
	}
	


	public void sacarSubcadena (String cad){

		System.out.println(cad.substring(1,4));
	}

		
	public int contarCaracteres(char caracter, String cad) {
		int contador=0;
		for(int cont=0; cont<cad.length();cont++) 
			if(cad.charAt(cont)==caracter)
				contador++;
		return contador;
	}
	
	public static void main(String[] args){	
		Ejercicio1 interfaz=new Ejercicio1();
	}

}
