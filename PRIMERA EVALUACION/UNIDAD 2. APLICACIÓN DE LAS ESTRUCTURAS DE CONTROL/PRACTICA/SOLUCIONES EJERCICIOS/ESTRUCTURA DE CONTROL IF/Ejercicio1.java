package estructuraIF;
import java.util.*;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int numero=0;		
	
		System.out.println("Introduce numero\n");

		numero=teclado.nextInt();
		if (numero==1)
			
			System.out.println("El número es uno\n");
		else
		
			if (numero==2)
				
				System.out.println("El número es dos\n");
			else
	
				System.out.println("Es otro número distinto de uno y dos\n");

	}


	}


