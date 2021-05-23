/*Hacer un programa que nos permita validar un número para que esté comprendido entre 1 y 10. Una vez validado debemos visualizar el número por pantalla.
NOTA: Validar significa que si el número no está entre 1 y 10 el programa debe estar pidiendo el número hasta que lo introduzcamos bien, para continuar el programa*/
package tema2;
import java.util.*;
public class Do_While {	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;		
		do {
			System.out.println("Meter un número comprendido entre 1 				y 10");
			numero=entrada.nextInt();			
		}while (numero<1||numero>10);		
		System.out.println("Número: "+numero);
	}
}
