package tema4_herencia_explicar_teoria;
import java.util.*;
public class Principal {
	Scanner teclado=new Scanner(System.in);
	public Principal() {
		SuperHeroe superPersona=new SuperHeroe();
		System.out.println("Meter edad super h�roe");
		int edad=teclado.nextInt();
		superPersona.setEdad(edad);
		teclado.nextLine();
		System.out.println("Meter nombre real super h�roe");
		superPersona.nombre=teclado.nextLine();
		System.out.println("Meter nombre ficci�n super h�roe");
		String nficcion=teclado.nextLine();
		superPersona.setNombreFiccion(nficcion);
		System.out.println(superPersona.toString());
		superPersona.correr();
		superPersona.volar();
		
	}

	public static void main(String[] args) {
		Principal p=new Principal();
	}
}
