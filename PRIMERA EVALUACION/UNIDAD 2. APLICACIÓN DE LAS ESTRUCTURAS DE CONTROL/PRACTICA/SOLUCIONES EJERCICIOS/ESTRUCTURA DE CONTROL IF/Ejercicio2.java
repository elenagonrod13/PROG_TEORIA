package estructuraIF;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int miEdad=0;		
		int edadCompi=0;	
		System.out.println("Introducir mi edad\n");
		miEdad=teclado.nextInt();
		System.out.println("Introducir edad de mi compa�ero\n");
		edadCompi=teclado.nextInt();
		if(miEdad<edadCompi)
			System.out.println("Soy m�s joven que mi compa�ero\n");
		else
			if(miEdad>edadCompi)
				System.out.println("mi compa�ero es m�s joven que 					yo\n");
			else
				System.out.println("Somos de la misma edad\n");


	}

}
