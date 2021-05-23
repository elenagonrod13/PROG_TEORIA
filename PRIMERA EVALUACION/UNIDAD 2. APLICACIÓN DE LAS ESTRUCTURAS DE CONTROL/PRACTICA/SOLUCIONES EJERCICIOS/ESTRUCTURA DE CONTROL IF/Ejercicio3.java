package estructuraIF;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		final int VALOR=2;
		float presion=0.0f;		
		String nombre;

		System.out.println("Introducir presion de la caldera\n");
		presion=teclado.nextFloat();

		if(presion>VALOR){
			System.out.println("Abrir válvula de seguridad\n");
			presion=presion-1;
		}

		else{
			System.out.println("Introducir tu nombre por el teclado\n");
			teclado.nextLine();
			nombre=teclado.nextLine();
			System.out.println("Todo está bien "+nombre);
		}


	}

}
