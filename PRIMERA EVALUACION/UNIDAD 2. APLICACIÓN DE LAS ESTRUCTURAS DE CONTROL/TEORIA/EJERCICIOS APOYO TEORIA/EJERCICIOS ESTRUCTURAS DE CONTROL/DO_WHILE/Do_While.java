/*Hacer un programa que nos permita validar un n�mero para que est� comprendido entre 1 y 10. Una vez validado debemos visualizar el n�mero por pantalla.
NOTA: Validar significa que si el n�mero no est� entre 1 y 10 el programa debe estar pidiendo el n�mero hasta que lo introduzcamos bien, para continuar el programa*/
package tema2;
import java.util.*;
public class Do_While {	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int numero;		
		do {
			System.out.println("Meter un n�mero comprendido entre 1 				y 10");
			numero=entrada.nextInt();			
		}while (numero<1||numero>10);		
		System.out.println("N�mero: "+numero);
	}
}
