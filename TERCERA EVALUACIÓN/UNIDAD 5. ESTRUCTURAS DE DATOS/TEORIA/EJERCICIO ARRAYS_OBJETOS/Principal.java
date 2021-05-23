package tema5_arrays_objetos;
import java.util.*;
public class Principal {
	private Scanner tecla=new Scanner(System.in);
	private final int TAM=3;
	private Persona []vector;

	public static void main(String[] args){
		Principal interfaz=new Principal();
	}

	public Principal(){
	  vector =cargarVector();
	  visualizar();
	}

	public Persona[] cargarVector(){
	  String nomb; int edad;
	  Persona[] vector=new Persona[TAM];
	  for (int cont=0; cont<vector.length; cont++){
		System.out.println("meter nombre");
		nomb=tecla.next();
		System.out.println("meter edad");
		edad=tecla.nextInt();
		vector[cont]=new Persona(nomb,edad);
	  }
	  return vector;
	}

	public void visualizar (){
	  /*for (Persona elemento:vector)
		System.out.println(elemento.getNombre()+" "
		+elemento.getEdad());	
	  */
		
	  for (int cont=0; cont<vector.length; cont++)
		System.out.println(vector[cont].getNombre()+" "+vector[cont].getEdad());	
	 }

}
