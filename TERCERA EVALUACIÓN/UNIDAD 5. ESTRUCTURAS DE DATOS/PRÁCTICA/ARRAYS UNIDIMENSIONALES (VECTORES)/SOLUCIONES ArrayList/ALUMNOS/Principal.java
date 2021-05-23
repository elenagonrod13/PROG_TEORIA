package ArrayList_alumnos;
import java.util.*;
public class Principal {
	public static Scanner sc = new Scanner(System.in);	
	GestorAlumnos gestor = new GestorAlumnos();
	public Principal() {		
		int opcion;	
		do {
			menu();
			opcion = tramitarOpcion();		
		} while(opcion!=0);		
	}
	
	public void menu() {

		System.out.println("Introduce una Opcion");
		System.out.println("1- Añadir");
		System.out.println("2- Borrar");
		System.out.println("3- Modificar");
		System.out.println("4- Visualizar");
		System.out.println("0- Salir");
		
	}
	
	public int tramitarOpcion() { 
		
		int opcion = sc.nextInt();
		String nombre;
		String dni;
		int edad;
	
		switch(opcion) {
		
			case 1: 
			
				System.out.println("Nombre");
				nombre = sc.next();
				System.out.println("Dni");
				dni = sc.next();
				System.out.println("Edad");
				edad = sc.nextInt();			
				Alumnos a = new Alumnos(nombre, dni, edad);				
				gestor.añadir(a);
				break;
				
			case 2: 							
				gestor.borrar();
				break;
				
			case 3:							
				gestor.modificar();
				break;
				
			case 4: 
				gestor.visualizar();
				break;			
			default:
				System.out.println("Opcion Incorrecta");
				
		
		}
		return opcion;
	}
	
	
	public static void main(String[] args) {

		Principal p = new Principal();

	}

}
