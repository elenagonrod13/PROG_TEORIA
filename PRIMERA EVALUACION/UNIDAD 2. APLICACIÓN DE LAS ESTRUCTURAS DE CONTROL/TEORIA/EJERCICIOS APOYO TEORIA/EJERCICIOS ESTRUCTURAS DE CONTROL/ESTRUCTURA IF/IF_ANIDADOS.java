/* Introducir por el teclado dos números y sumarlos. Si la suma es mayor a 5,sacar por pantalla el resultado de la suma, en caso contrario, si la suma es menor a 5, sacar el mensaje: La suma es menor a 5 y si es igual a 5 visualizar el mensaje: La suma es igual a 5. 
Al final el programa debe sacar: Fin de programa*/
package tema1;
import java.util.*;
public class Ejercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner(System.in);	
		
		System.out.println("Meter dos números");
		
		int numero1=teclado.nextInt();
		
		int numero2=teclado.nextInt();
		
		int resultado=numero1+numero2;
		
		if(resultado>5) {
			
			System.out.println("La suma es: "+resultado);
		}
		else {
			if(resultado<5) {
				System.out.println("La suma es menor que 5");
			}
			else {
				System.out.println("La suma es igual a 5");
			}
		}
		System.out.println("Fin de programa");	
	}
}



