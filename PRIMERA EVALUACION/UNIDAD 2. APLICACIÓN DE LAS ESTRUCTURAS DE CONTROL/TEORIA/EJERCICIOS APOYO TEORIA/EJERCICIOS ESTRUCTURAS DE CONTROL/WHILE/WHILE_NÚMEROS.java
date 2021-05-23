/*Hacer un programa que me permita meter un número por el teclado y nos permita sacar por pantalla todos los números desde él hasta el 1. Ejm: Si metemos el 3 debemos sacar por pantalla 3 2 1*/

package tema2;
import java.util.*;
public class repetitiva_while {
	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);	
		
		System.out.println("Mete un numero");
		
		int numero=teclado.nextInt();
		
		while (numero>=1){			
			System.out.print(numero+" ");
			numero=numero-1;				
		}
	}
}

