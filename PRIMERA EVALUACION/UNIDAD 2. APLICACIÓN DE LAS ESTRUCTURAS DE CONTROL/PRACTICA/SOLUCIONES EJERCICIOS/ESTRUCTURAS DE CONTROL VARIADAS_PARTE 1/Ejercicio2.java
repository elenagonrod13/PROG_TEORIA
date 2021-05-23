package tema2;
import java.util.*;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,factorial=1;
		 do {
			 System.out.println("Introduce un número positivo menor a 7 para calcular el factorial");		
			 numero=teclado.nextInt();
		 }while ((numero<0)||(numero>=7));			
		for (int contador=2;contador<=numero;contador++)
			factorial=factorial*contador;
		System.out.println("el factorial de "+numero+ " es "+factorial);
	}
}

	


