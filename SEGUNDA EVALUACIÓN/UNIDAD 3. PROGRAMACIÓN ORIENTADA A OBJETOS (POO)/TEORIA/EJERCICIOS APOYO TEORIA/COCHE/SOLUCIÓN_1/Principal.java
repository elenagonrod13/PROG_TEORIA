package tema3_poo_afianzar_teoria_ejercicio_coche;
import java.util.*;
public class Principal {
	Coche c2;
	Scanner sc;

	public Principal () {	
		sc=new Scanner(System.in);
		String marca;
		float precio;					
		System.out.print("Meter marca: ");
		marca=sc.nextLine();
		System.out.print("Meter precio:  ");
		precio=sc.nextFloat();		
		c2=new Coche(marca,precio);				
		System.out.println(c2.getMarca()+" "+c2.getPrecio());
		System.out.println("Pasos para empezar a conducir");
		Coche.empezar_conducir();
		System.out.println("El precio total del coche es "+ 				c2.calcularPrecioIva());	
		sc.close();
	}

	public static void main(String[ ] args) {

		Principal interfaz=new Principal();
	} 

}
